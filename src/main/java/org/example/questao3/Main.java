/* ======================================================================================================================== */
// Desafio 3
// Sequência de Fibonacci (Recursividade)

/*
A Sequência de Fibonacci tem como primeiros termos os números 0 e 1 e, a seguir,
cada termo subsequente é obtido pela soma dos dois termos predecessores:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

Fibonacci(0) = 0
Fibonacci(1) = 1
Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)

- Entrada

O arquivo de entrada contém um valor inteiro N.

- Saída

Imprima o valor relativo ao N número da sequência de Fibonacci, exemplo:

N = 0  => saída "Fib = 0"
N = 1  => saída "Fib = 1"
N = 3  => saída "Fib = 2"
M = 29 => saída "Fib = 514229"

 */

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
