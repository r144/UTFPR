/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDD01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author renat
 */
public class Calculadora {

    public List<Propostas> calcular(float salario, float valorDoEmprestimo) {
        ArrayList<Propostas> propostas = new ArrayList<>();

        if (salario <= 1000) {
            propostas.add(new Propostas(2 * valorDoEmprestimo, 2));
            propostas.add(new Propostas(2 * valorDoEmprestimo, 3));
            
        } else if (salario <= 5000){
            propostas.add(new Propostas(1.3f * valorDoEmprestimo, 2));
            propostas.add(new Propostas(1.5f * valorDoEmprestimo, 4));
            propostas.add(new Propostas(1.5f * valorDoEmprestimo, 10));
        } else{
            propostas.add(new Propostas(1.1f * valorDoEmprestimo, 2));
            propostas.add(new Propostas(1.3f * valorDoEmprestimo, 4));
            propostas.add(new Propostas(1.3f * valorDoEmprestimo, 10));
            propostas.add(new Propostas(1.4f * valorDoEmprestimo, 20));
        }
        return propostas;
    }

}
