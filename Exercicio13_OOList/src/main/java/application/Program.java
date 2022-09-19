package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

import static java.lang.System.*;


/** @author Davyd Kennedy Vitorino*
 * Fazer um programa para ler um número inteiro N e depois os
 * dados (id, nome e salario) de N funcionários. Não deve haver
 * repetição de id.
 * <p>
 * Em seguida, efetuar o aumento de X por cento no salário de
 * um determinado funcionário. Para isso, o programa deve ler
 * um id e o valor X. Se o id informado não existir, mostrar
 * uma mensagem e abortar a operação. Ao final, mostrar a
 * listagem atualizada dos funcionários, conforme exemplos.
 * <p>
 * Lembre-se de aplicar a técnica de encapsulamento para não
 * permitir que o salário possa ser mudado livremente. Um
 * salário só pode ser aumentado com base em uma operação
 * de aumento por porcentagem dada.
 */

public class Program {

    public static void main(String[] args) {

        try(Scanner scan = new Scanner(in)) {

            Locale.setDefault(Locale.US);

            List<Employee> list = new ArrayList<>();

            out.println("How many employees will be registered?");
            int n = scan.nextInt();

            for (int i = 0; i < n; i++) {

                out.println();
                out.println("Employee #" + (i + 1) + ":");
                out.print("Id: ");
                int id = scan.nextInt();
                while (hasId(list, id)){
                    out.println("Id already taken! Try again: ");
                    id = scan.nextInt();
                }

                out.print("Name: ");
                scan.nextLine(); // limpeza do buffer de entrada
                String name = scan.nextLine();

                out.print("Salary: U$");
                Double salary = scan.nextDouble();

                Employee emp = new Employee(id, name, salary);

                list.add(emp);
            }

            out.println();
            out.print("Enter the employee id that will have salary increase: ");
            int idSalary = scan.nextInt();

            Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
            //Integer pos = position(list, idSalary);

            if (emp == null) {
                out.println("This id does not exist!");
            }
            else {
                out.print("Enter the percentage: ");
                double percent = scan.nextDouble();
                emp.increaseSalary(percent);
            }

            // PART 3 - LISTING EMPLYEES:
            out.println();
            out.println("List of employees: ");
            for (Employee e : list) {
                out.println(e);
            }
        }
    }

    public static boolean hasId( List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}