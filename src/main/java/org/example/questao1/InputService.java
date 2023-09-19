package org.example.questao1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputService {

    private static Scanner sc;

    public InputService() {
        sc = new Scanner(System.in);
    }

    public int receberQuantidadeNumeros() {
        System.out.print("Digite a quantidade de números (N) que deseja inserir: ");
        return receberEntradaNumeroInteiro();
    }

    public int[] receberListaNumeros(int n){
        int [] listaNumeros = new int[n];
        for (int i = 0; i < n ; i++){
            System.out.printf("N(%d): ", i);
            listaNumeros[i] = receberEntradaNumeroInteiro();
        }
        return listaNumeros;
    }

    public int receberEntradaNumeroInteiro() {
        while (true) {
            try {
                int num = sc.nextInt();
                if (num <= 0) throw new InputMismatchException();
                return num;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite um número inteiro positivo.");
                System.out.print("Digite a quantidade de números (N) que deseja inserir: ");
                sc.nextLine();
            }
        }
    }
}
