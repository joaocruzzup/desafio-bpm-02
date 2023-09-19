package org.example.questao2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        long num = receberEntradaInteiroPositivo();

        SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
        formatadorData.setTimeZone(TimeZone.getTimeZone("UTC"));

        String dataFormatada = formatadorData.format(new Date(num * 1000L));

        System.out.println("A data correspondente ao número " + num + " é: " + dataFormatada);
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

