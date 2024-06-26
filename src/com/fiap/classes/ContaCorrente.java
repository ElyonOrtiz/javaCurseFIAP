package com.fiap.classes;

import com.fiap.classes.Conta;

public class ContaCorrente extends Conta {
    private String tipo;
    private double chequeEspecial;

    public ContaCorrente(int numero, String tipo){
        super(numero);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getSaldoDisponivel(){
        return  getSaldo() + this.chequeEspecial;
    }

    @Override
    public double verificarSaldo() {
        return getSaldoDisponivel();
    }

    @Override
    public void retirar(double valor){
        valor = valor + 10;
        super.retirar(valor);
    }
}