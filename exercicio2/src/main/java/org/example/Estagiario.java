package org.example;

public class Estagiario extends Funcionario{
    private double valorBolsa;
    private int cargaHoraria;

    public Estagiario(String nome, int matricula, double salarioBase, String dataAdmissao) {
        super(nome, matricula, salarioBase, dataAdmissao);
    }
}
