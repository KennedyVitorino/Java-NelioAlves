package entities;

/**
 * @author Davyd Kennedy Vitorino
 */

public class Employee {

    private Integer id;
    private String name;
    private Double salary;

    //Construtor padrão vazio
    public Employee() {
    }

    // Construtor com argumentos
    public Employee(Integer id, String name, Double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100.0;
    }

    @Override
    public String toString() {
        return "Id: " + id +", Name: " + name + ", Salary: U$" + String.format("%.2f", salary);
    }
}