package org.example;

import java.util.Scanner;

public class verificarNumeros {
    public static void positivoNegativo(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        Float num = scanner.nextFloat();

        if(num > 0){
            System.out.println("Positivo");
        }else if(num < 0){
            System.out.println("Negativo");
        }else if( num == 0) {
            System.out.println("zero");
        }
    }
}
