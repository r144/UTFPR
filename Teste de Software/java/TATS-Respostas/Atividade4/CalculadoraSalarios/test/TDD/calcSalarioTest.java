/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDD;

import calculadorasalarios.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author renato
 */
public class calcSalarioTest {

    CalculadoraSalarios calculadora;
    funcionario f;

    public calcSalarioTest() {
    }

    @Before
    public void InstanciaFuncionario() {
        f = new funcionario();
        f.setCargo("DESENVOLVEDOR");
        f.setEmail("ronaldo@gmail.com");
        f.setNome("ronaldo");
        calculadora = new CalculadoraSalarios();
    }

    @Test
    public void testDesenvolvedor() {
        f.setCargo("DESENVOLVEDOR");
        f.setSalarioBase(5000f);
        float salario = calculadora.Calcula(f);
        assertEquals(4000, salario, 0.0f);
    }

    @Test
    public void testDesenvolvedor2() {
        f.setCargo("DESENVOLVEDOR");
        f.setSalarioBase(3500f);
        float salario = calculadora.Calcula(f);
        assertEquals(2800f, salario, 0.0f);
    }

    @Test
    public void testGerente() {
        f.setCargo("GERENTE");
        f.setSalarioBase(2500f);
        float salario = calculadora.Calcula(f);
        assertEquals(2000, salario, 0.0f);
    }

    @Test
    public void testGerente2() {
        f.setCargo("GERENTE");
        f.setSalarioBase(5500f);
        float salario = calculadora.Calcula(f);
        assertEquals(3850, salario, 0.0f);
    }

    @Test
    public void testTestador() {
        f.setCargo("TESTADOR");
        f.setSalarioBase(550f);
        float salario = calculadora.Calcula(f);
        assertEquals(467.5f, salario, 0.0f);
    }
    @Test
    public void testTestador2() {
        f.setCargo("TESTADOR");
        f.setSalarioBase(2500f);
        float salario = calculadora.Calcula(f);
        assertEquals(1875f, salario, 0.0f);
    }
    @Test
    public void testDba() {
        f.setCargo("DBA");
        f.setSalarioBase(550f);
        float salario = calculadora.Calcula(f);
        assertEquals(467.5f, salario, 0.0f);
    }

    @Test
    public void testDba2() {
        f.setCargo("DBA");
        f.setSalarioBase(2500f);
        float salario = calculadora.Calcula(f);
        assertEquals(1875f, salario, 0.0f);
    }
}
