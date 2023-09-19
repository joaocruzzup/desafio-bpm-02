package org.example.questao1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        executarOrdenacaoEImpressao();
    }

    public static void executarOrdenacaoEImpressao() {
        InputService inputService = new InputService();
        OrdenadorService ordenadorService = new OrdenadorService();

        int quantidade = inputService.receberQuantidadeNumeros();
        int[] valores = inputService.receberListaNumeros(quantidade);

        List<Integer> valoresOrdenados = ordenadorService.ordenarParesEImpares(valores);

        System.out.println("--- Valores ordenados ---");
        for (int valor : valoresOrdenados) {
            System.out.println(valor);
        }
    }
}
