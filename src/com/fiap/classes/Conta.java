package com.fiap.classes;

public class Conta {
    private int numero;
    private int agencia;
    private double saldo;

    public Conta(int numero){
        this.numero = numero;
    }
    public Conta(int numero, int agencia, double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public double verificarSaldo(){
        return saldo;
    }

    public void retirar(double valor){
        saldo = saldo -valor;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
