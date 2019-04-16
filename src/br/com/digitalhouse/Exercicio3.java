package br.com.digitalhouse;

import java.util.HashSet;
import java.util.Set;

public class Exercicio3 {
    public static void main(String[] args) {
        Set<Integer> elementos = new HashSet<>();
        elementos.add(2);
        elementos.add(7);
        elementos.add(5);
        elementos.add(1);

        Prova prova = new Prova();
        prova.somaTotal(elementos);

    }
}
