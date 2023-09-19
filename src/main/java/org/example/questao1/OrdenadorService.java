package org.example.questao1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenadorService {
    public List<Integer> ordenarParesEImpares(int[] valores) {
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int valor : valores) {
            if (valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }
        }

        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());
        pares.addAll(impares);
        return pares;
    }
}
