package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercicio2 {



    public static void main(String[] args) {
        List<Integer> listVazia = new ArrayList<>();
       listVazia.add(1);
       listVazia.add(5);
       listVazia.add(5);
       listVazia.add(6);
       listVazia.add(7);
       listVazia.add(8);
       listVazia.add(8);
       listVazia.add(8);

        System.out.println(listVazia);

        Set<Integer> conjuntoVazio = new HashSet<>();
        conjuntoVazio.add(1);
        conjuntoVazio.add(5);
        conjuntoVazio.add(5);
        conjuntoVazio.add(6);
        conjuntoVazio.add(7);
        conjuntoVazio.add(8);
        conjuntoVazio.add(8);
        conjuntoVazio.add(8);

        System.out.println(conjuntoVazio);
    }
}
