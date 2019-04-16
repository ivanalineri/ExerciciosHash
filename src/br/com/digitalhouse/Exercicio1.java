package br.com.digitalhouse;

import java.util.HashMap;
import java.util.Map;

public class Exercicio1 {
    public static void main(String[] args) {

        Map<Integer, String> loteriaDosSonhos = new HashMap<>();
        loteriaDosSonhos.put(0,"Ovo");
        loteriaDosSonhos.put(1, "Água");
        loteriaDosSonhos.put(2, "Escopeta");
        loteriaDosSonhos.put(3, "Cavalo");
        loteriaDosSonhos.put(4,"Dentista");
        loteriaDosSonhos.put(5, "Fogo");

        Map<String,String> dicionario = new HashMap<>();
        dicionario.put("João", "Juan, Fissura, Maromba");
        dicionario.put("Miguel", "Night Watch, Bruce Wayne, Tampinha");
        dicionario.put("Maria", "Wonder Woman, Mary, Marilene");
        dicionario.put("Lucas","Lukinha, Jorge, George");

        for(int chave: loteriaDosSonhos.keySet()){
            System.out.println("Valor da loteria " + loteriaDosSonhos.get(chave));
        }

        for(String chave: dicionario.keySet()){
            System.out.println("Valor do Dicionario " + dicionario.get(chave));
        }

      /*  System.out.println(loteriaDosSonhos.get(5));
        System.out.println(dicionario.get("Maria"));*/


    }




}
