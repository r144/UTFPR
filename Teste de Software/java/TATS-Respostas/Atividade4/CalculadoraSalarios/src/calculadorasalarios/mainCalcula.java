/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorasalarios;

/**
 *
 * @author renat
 */
public class mainCalcula {
    public static void main(String[] args) {
        CalculadoraSalarios calc = new CalculadoraSalarios();
        float salario;
        funcionario f = new funcionario("Ronaldo","ronaldo@gmail.com",5000f,"DESENVOLVEDOR");
        f.setSalarioBase(5000f);
        salario = calc.Calcula(f);
        System.out.println("salario de desenvolvedor com 5000 base: "+ salario);
    }
}
