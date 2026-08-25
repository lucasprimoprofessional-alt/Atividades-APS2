package org.example;

public class Funcionario {

    private String nome;
    private int matricula;
    private double salarioBase;
    private String dataAdmissao;

    public Funcionario (String nome, int matricula, double salarioBase, String dataAdmissao){
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
        this.dataAdmissao = dataAdmissao;
    }

    public double calcularSalario(){
        return salarioBase;
    }

    public double calcularDesconto(){
        double desconto = salarioBase % 0.08;
        return desconto;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

}