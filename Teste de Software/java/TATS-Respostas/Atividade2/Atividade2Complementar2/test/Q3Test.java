/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import atividade2complementar2.TurmaDAO;
import atividade2complementar2.Turma;
import atividade2complementar2.TurmaController;
import atividade2complementar2.VerificadorDeCodigos;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author renat
 */
public class Q3Test {

    TurmaDAO daoMock;
    VerificadorDeCodigos verMock;
    Turma turma;
    TurmaController controller;

    public Q3Test() {
        daoMock = mock(TurmaDAO.class);
        verMock = mock(VerificadorDeCodigos.class);
        turma = new Turma();
        controller = new TurmaController(daoMock);
        controller.setVerificador(verMock);
    }

    @Test
    public void Test1() {
        when(verMock.verificarCodigoDisciplina(any())).thenReturn(Boolean.FALSE);
        String ret = controller.cadastrarTurma(turma);
        assertEquals("codigo disciplina invalido", ret);
    }

    @Test
    public void TesteDisciplinaInvalida() {
        when(verMock.verificarCodigoDisciplina(any())).thenReturn(Boolean.FALSE);
        String ret = controller.cadastrarTurma(turma);
        assertEquals("codigo disciplina invalido", ret);
    }

    @Test
    public void TesteTurmaInvalida() {
        when(verMock.verificarCodigoDisciplina(any())).thenReturn(Boolean.TRUE);
        when(verMock.verificarCodigoTurma(any())).thenReturn(Boolean.FALSE);
        String ret = controller.cadastrarTurma(turma);
        assertEquals("codigo turma invalido", ret);
    }

    @Test
    public void TesteTurmaJaExiste() {
        when(verMock.verificarCodigoDisciplina(any())).thenReturn(Boolean.TRUE);
        when(verMock.verificarCodigoTurma(any())).thenReturn(Boolean.TRUE);
        when(daoMock.existe(any())).thenReturn(Boolean.TRUE);
        String ret = controller.cadastrarTurma(turma);
        assertEquals("turma ja existe", ret);
    }

    @Test
    public void TesteTurmaSalva() {
        when(verMock.verificarCodigoDisciplina(any())).thenReturn(Boolean.TRUE);
        when(verMock.verificarCodigoTurma(any())).thenReturn(Boolean.TRUE);
        when(daoMock.existe(any())).thenReturn(Boolean.FALSE);
        when(daoMock.salvar(any())).thenReturn(Boolean.TRUE);
        String ret = controller.cadastrarTurma(turma);
        assertEquals("turma salva com sucesso", ret);
    }

    @Test
    public void TesteErroBd() {
        when(verMock.verificarCodigoDisciplina(any())).thenReturn(Boolean.TRUE);
        when(verMock.verificarCodigoTurma(any())).thenReturn(Boolean.TRUE);
        when(daoMock.existe(any())).thenReturn(Boolean.FALSE);
        when(daoMock.salvar(any())).thenReturn(Boolean.FALSE);
        String ret = controller.cadastrarTurma(turma);
        assertEquals("turma nao salva. Erro no BD", ret);
    }
}
