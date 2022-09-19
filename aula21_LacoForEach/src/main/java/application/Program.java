package application;

/**
 * @author Davyd
 */
public class Program {

    public static void main(String[] args) {

        String[] vect = new String[] {"Maria", "João", "Anta", "Antoin"};

        for (int i = 0 ; i < vect.length; i++) {
         System.out.println(vect[i]);
        }

        System.out.println("--------------------------------");
        //Para cad OBJETO obj contido no VETOR vect FAÇA
        for (String obj : vect) {
            System.out.println(obj);
        }
    }
}
