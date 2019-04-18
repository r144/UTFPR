/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDD01;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author renat
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testeLimite1000() {
         Calculadora c = new Calculadora();
         List<Propostas> propostas = c.calcular(500.00f, 800.00f);
         assertEquals(2, propostas.size());
         Propostas p1 = propostas.get(0);
         Propostas p2 = propostas.get(1);
         
         assertEquals(1600f, p1.getTotal(), 0.01);
         assertEquals(2, p1.getNumeroParcelas());
         assertEquals(800f, p1.getValorParcela(), 0.01);
         
         assertEquals(1600f, p2.getTotal(), 0.01);
         assertEquals(3, p2.getNumeroParcelas());
         assertEquals(533.33f, p2.getValorParcela(), 0.01);
         
     };
     
    @Test
     public void testeLimite1000a() {
         Calculadora c = new Calculadora();
         List<Propostas> propostas = c.calcular(1800,800.00f);
         assertEquals(2, propostas.size());
         Propostas p1 = propostas.get(0);
         Propostas p2 = propostas.get(1);
         Propostas p3 = propostas.get(2);
         
         assertEquals(2340, p1.getTotal(), 0.01);
         assertEquals(2, p1.getNumeroParcelas());
         assertEquals(800f, p1.getValorParcela(), 0.01);
         
         assertEquals(1600f, p2.getTotal(), 0.01);
         assertEquals(3, p2.getNumeroParcelas());
         assertEquals(533.33f, p2.getValorParcela(), 0.01);
         
        assertEquals(1600f, p2.getTotal(), 0.01);
         assertEquals(3, p2.getNumeroParcelas());
         assertEquals(533.33f, p2.getValorParcela(), 0.01);
     };
     
         @Test
     public void testeAcima5000() {
         Calculadora c = new Calculadora();
         List<Propostas> propostas = c.calcular(10000f, 5500f);
         assertEquals(2, propostas.size());
         Propostas p1 = propostas.get(0);
         Propostas p2 = propostas.get(1);
         Propostas p3 = propostas.get(2);
         Propostas p4 = propostas.get(3);
         
         assertEquals(6050, p1.getTotal(), 0.01);
         assertEquals(2, p1.getNumeroParcelas());
         assertEquals(3025, p1.getValorParcela(), 0.01);
         
         assertEquals(7150f, p2.getTotal(), 0.01);
         assertEquals(4, p2.getNumeroParcelas());
         assertEquals(1787f, p2.getValorParcela(), 0.01);
         
         assertEquals(7150, p3.getTotal(), 0.01);
         assertEquals(10, p3.getNumeroParcelas());
         assertEquals(533.33f, p3.getValorParcela(), 0.01);
         
         assertEquals(7700f, p4.getTotal(), 0.01);
         assertEquals(20, p4.getNumeroParcelas());
         assertEquals(533.33f, p4.getValorParcela(), 0.01);
     };
}
