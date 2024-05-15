package com.fiap.classes;

public class Teste {
    public static void main(String[] args){
        Conta cc = new Conta(20, 123, 321) {
            @Override
            public double verificarSaldo() {
                return 0;
            }
        };

        cc.depositar(100);
        System.out.println(cc.getSaldo());

        Conta poupança = new Conta(111, 222, 333) {
            @Override
            public double verificarSaldo() {
                return 0;
            }
        };
        System.out.println(poupança.verificarSaldo());
    }
}
