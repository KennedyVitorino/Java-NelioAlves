package application;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Davyd
 */
public class Program {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        //Adicionar elementos a lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco Antonio");

        // Tamanho da lista
        System.out.println("Tamanho da lista: " + list.size());
        System.out.println("------------------------------");

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("------------------------------");

        /*Remover da lista
        list.remove(1);
        Remover da lista a partir de um PREDICADO*/
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);

        }

        System.out.println("------------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));

        // retorna -1 quando não encontra o elemento
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("------------------------------");

    }
}