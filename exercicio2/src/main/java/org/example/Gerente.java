package org.example;

public class Gerente extends FuncionarioCLT{

    private int tamanhoEquipe;
    private double percentualBonus;

    public Gerente(String nome, int matricula, double salarioBase, String dataAdmissao, double valeTransporte, double valeAlimentacao, int tamanhoEquipe, double percentualBonus) {
        super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao);
        this.tamanhoEquipe = tamanhoEquipe;
        this.percentualBonus = percentualBonus;
    }

    @Override
    public double calcularSalario(){
        return super.calcularSalario() + (getSalarioBase()* percentualBonus);
    }
}
