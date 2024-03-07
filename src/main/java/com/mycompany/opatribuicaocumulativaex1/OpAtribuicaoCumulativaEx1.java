/*
Incrementar um número em 5
Multiplicar um número por 2
 */
package com.mycompany.opatribuicaocumulativaex1;

import java.util.Locale;
import java.util.Scanner;

public class OpAtribuicaoCumulativaEx1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        System.out.println("Digite um número para soma, um número para multiplicação e um número para subtração: ");

        int s = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        double d = teclado2.nextDouble();

        s += 5;
        System.out.println("O valor da soma de s é: " + s);

        b *= 2;
        System.out.println("O valor da multiplicação de b é: " + b);

        c -= 3;
        System.out.println("O valor da subtração de c é: " + c);

        d /= 4;
        System.out.println("O valor da divisão de d é " + d);

    }
}
