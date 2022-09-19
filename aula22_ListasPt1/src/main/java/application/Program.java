package application;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Davyd
 */
public class Program {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        System.out.println("Lista vazia:\n" + list);
        System.out.println("------------------------------");

        // Adicionando elementos a lista
        System.out.println("Adicionando elementos a lista:");
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco Antonio");
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("------------------------------");

        // Tamanho da lista
        System.out.println("Tamanho da lista: " + list.size());

        // Remover da lista a partir de um predicado
        System.out.println("------------------------------");
        System.out.println("Removendo elementos da lista a partir de um PREDICADO: ");
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);

        }

        //Encontrar a posição de um elemento
        System.out.println("------------------------------");
        System.out.println("Encontrar a posição de um elemento:");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));

        // Retorna -1 quando não encontra o elemento
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        // Filtrar lista de modo que fique na lista somente aqueles elementos que começam com o caractere A
        System.out.println("------------------------------");
        System.out.println("Filtrar lista de modo que fique na lista somente aqueles elementos que começam com o caractere 'A':");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();
        for(String x : result) {
            System.out.println(x);
        }
        // Encontrar um elemento da lista que atenda certo predicado
        System.out.println("------------------------------");
        System.out.println("Encontrar um elemento da lista que atenda certo predicado:");
        String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
        System.out.println(name);

        String name1 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println("Caso não exista o elemento será retornado:\n" + name1);
    }
}