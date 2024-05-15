package com.studies.java.looping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao;
        int numero;
        do {
            System.out.print("Digite um número inteiro positivo: ");
            numero = scanner.nextInt();
            boolean ehPrimo = true;
            int i;
            ArrayList<Integer> results = new ArrayList<>();

            for(i=1; numero>i; i++){
                if(numero%i==0){
                    int result = numero/i;
                    results.add(result);
                }
                if(results.size()==1){
                    ehPrimo=true;
                }else {
                    ehPrimo=false;
                }
            }

            if (ehPrimo) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }

        }while (numero>0);{
            scanner.close();
        }
    }
}