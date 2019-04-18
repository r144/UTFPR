/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import atividade2.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

/**
 *
 * @author Renato
 */
public class testeAtiv2 {

//    protected SenhaValidator svMocked;
    public UsuarioDAO daoMocked;
    public UsuarioValidator userV;
    public Usuario user;
    public SenhaValidator sValidatorMocked;

    @Before
    public void InicioTeste() {
        daoMocked = mock(UsuarioDAO.class);
        userV = new UsuarioValidator(daoMocked);
        sValidatorMocked = mock(SenhaValidator.class);
        userV.setSenhaValidator(sValidatorMocked);
        user = new Usuario();
    }

    @Test
    public void ValidacaoNome() {
        user.setNome("Rena");
        try {
            userV.ehUsuarioValido(user);
        } catch (Exception e) {
            String msgm = e.getMessage();
            assertEquals("nome do usuario precisa de pelo menos 5 caracteres", msgm);
        }
    }

    @Test
    public void ValidacaoConfirmacaoSenha() {
        user.setNome("Renato");
        user.setSenha("senha1");
        user.setSenhaConfirmada("senhadiferente");
        try {
            userV.ehUsuarioValido(user);
        } catch (Exception e) {
            String msgm = e.getMessage();
            assertEquals("senhas diferentes", msgm);
        }
    }

    @Test
    public void ValidacaoSenha() {
        user.setNome("Renato");
        user.setSenha("senhaInvalida");
        user.setSenhaConfirmada("senhaInvalida");

        when(sValidatorMocked.verificar(any()))
                .thenReturn(Boolean.TRUE);
        try {
            userV.ehUsuarioValido(user);
        } catch (Exception e) {
            String msgm = e.getMessage();
            assertEquals("senha invalida", msgm);
        }
    }

    @Test
    public void ValidacaoCaracteresNome() throws Exception {
        user.setNome("Ren@to1");
        user.setSenha("senhaInvalida");
        user.setSenhaConfirmada("senhaInvalida");

        when(sValidatorMocked.verificar(any()))
                .thenReturn(Boolean.FALSE);
        assertEquals(false, userV.ehUsuarioValido(user));
    }

    @Test
    public void ValidaNomeExistente() throws Exception {
        user.setNome("Renato");
        user.setSenha("senhadificilevalida");
        user.setSenhaConfirmada("senhadificilevalida");

        when(sValidatorMocked.verificar(any()))
                .thenReturn(Boolean.FALSE);
        when(daoMocked.getByName(any()))
                .thenReturn(new Usuario());
        try {
            userV.ehUsuarioValido(user);
        } catch (Exception e) {
            String msgm = e.getMessage();
            assertEquals("usuario ja existe", msgm);
        }
    }
}
