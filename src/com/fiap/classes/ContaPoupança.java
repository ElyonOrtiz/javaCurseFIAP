package com.fiap.classes;

public class ContaPoupança extends Conta {

    public ContaPoupança(int numero) {
        super(numero);
    }

    @Override
    public double verificarSaldo() {
        return saldo;
    }
}
