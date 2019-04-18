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
public class CalculadoraSalarios {

    public float Calcula(funcionario f) {
        float salario = 0;
        float salarioBase = f.getSalarioBase();
        if (f.getCargo().equals("DESENVOLVEDOR")) {
            if (salarioBase < 3000) {
                salario = salarioBase - salarioBase * 0.1f;
            } else {
                salario = salarioBase - salarioBase * 0.2f;

            }
        } else if (f.getCargo().equals("DBA")) {
            if (salarioBase < 2000) {
                salario = salarioBase - salarioBase * 0.15f;
            } else {
                salario = salarioBase - salarioBase * 0.25f;

            }
        } else if (f.getCargo().equals("TESTADOR")) {
            if (salarioBase < 2000) {
                salario = salarioBase - salarioBase * 0.15f;
            } else {
                salario = salarioBase - salarioBase * 0.25f;

            }
        } else if (f.getCargo().equals("GERENTE")) {
            if (salarioBase < 5000) {
                salario = salarioBase - salarioBase * 0.2f;
            } else {
                salario = salarioBase - salarioBase * 0.3f;

            }
        }

        return salario;
    }

}
