
package org.example.questao3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long n = receberEntradaInteiroPositivo();

        long resultado = calcularFibonacci(n);

        System.out.println("O " + n + "º número na sequência de Fibonacci é: " + resultado);
    }

    public static long calcularFibonacci(long n) {
        return n <=1 ? n : calcularFibonacci(n -1 ) + calcularFibonacci(n - 2);
    }

    public static long receberEntradaInteiroPositivo() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Digite um valor inteiro positivo: ");
                long num = sc.nextLong();
                if (num < 0) throw new InputMismatchException();
                return num;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Insira um valor inteiro positivo.");
                sc.nextLine();
            }
        }
    }
}
