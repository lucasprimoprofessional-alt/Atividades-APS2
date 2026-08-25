package org.example;

public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("João", 123, 1589.9, "12/08/2003");
        Gerente g1 = new Gerente("Pedro", 12344, 5294.00, "12/12/2012", 500.0, 500.0, 4, 0.05);
        System.out.println("Salario Base: " + f1.calcularSalario() + "\nDesconto: " + f1.calcularDesconto());
        System.out.println(g1.calcularSalario());
    }
}