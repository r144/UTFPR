/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import atividade2complementar.Classificador;
import atividade2complementar.Pessoa;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author renat
 */
public class TesteQ2 {

    public Pessoa p;
    public Classificador classificador;

    public TesteQ2() {
    }

    @Before
    public void inicioTeste() {
        classificador = new Classificador();
    }

    @Test
    public void IdadeInvalida() {
        p = new Pessoa("Rogerio", -1);
        try {
            classificador.definirFaixaEtaria(p);
        } catch (Exception e) {
            assertEquals("idade invalida", e.getMessage());
        }
    }

    @Test
    public void CriancaTeste() {
        p = new Pessoa("Rogerio", 10);
        try {
            classificador.definirFaixaEtaria(p);
        } catch (Exception e) {
            assertEquals("crianca", e.getMessage());
        }
    }

    @Test
    public void AdolescenteTeste() {
        p = new Pessoa("Rogerio", 17);
        try {
            classificador.definirFaixaEtaria(p);
        } catch (Exception e) {
            assertEquals("adolescente", e.getMessage());
        }
    }

    @Test
    public void AdultoTeste() {
        p = new Pessoa("Rogerio", 39);
        try {
            classificador.definirFaixaEtaria(p);
        } catch (Exception e) {
            assertEquals("adulto", e.getMessage());
        }
    }
    @Test
    public void IdosoTeste() {
        p = new Pessoa("Rogerio", 75);
        try {
            classificador.definirFaixaEtaria(p);
        } catch (Exception e) {
            assertEquals("idoso", e.getMessage());
        }
    }
}
