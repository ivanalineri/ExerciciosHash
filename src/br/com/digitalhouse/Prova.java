package br.com.digitalhouse;

import java.util.Set;

public class Prova {
    public void somaTotal(Set<Integer> conjuntoDeInteiros){
        float total = 0;
        for(Integer valor: conjuntoDeInteiros){
            total += valor;
            System.out.println("Total " + valor);
        }

    }
}
