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
        System.out.println("------------------------------");


        /* Remover da lista
        list.remove(1);
        Remover da lista a partir de um PREDICADO*/
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

        // Filtrar elementos da lista a partir de um PREDICADO
        System.out.println("------------------------------");
        System.out.println("Filtrar elementos da lista a partir de um PREDICADO:");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();
        for(String x : result) {
            System.out.println(x);
        }

        System.out.println("------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);





    }
}