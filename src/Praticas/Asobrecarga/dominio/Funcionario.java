package Praticas.Asobrecarga.dominio;

public class Funcionario {
    private String name;
    private int age;
    private double salary;
    private String enterprise;

    public Funcionario(String name, int age, double salary, String enterprise) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.enterprise = enterprise;
    }

    public Funcionario() {

    }

    public void imprime(){
        System.out.println("Nome:  " +this.name + " - " + "Idade: " +this.age  + " - " + "Salario: " + this.salary  + " - " + "Empresa: " + this.enterprise);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }
}
