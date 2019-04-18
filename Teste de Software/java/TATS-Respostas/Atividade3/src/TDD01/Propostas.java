/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDD01;

/**
 *
 * @author renat
 */
class Propostas {
    float total;
    int numeroParcelas;
    float valorParcela;

    public Propostas(float ptotal, int pNumeroParcelas) {
        total = ptotal;
        numeroParcelas = pNumeroParcelas;
    }

    
    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public float getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(float valorParcela) {
        this.valorParcela = valorParcela;
    }
   
}
