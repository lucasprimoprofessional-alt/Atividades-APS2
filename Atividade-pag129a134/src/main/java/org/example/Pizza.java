package org.example;

public abstract class Pizza {
    protected String nome;

    public void preparar() {
        System.out.println("Preparando " + nome);
    }

    public void assar() {
        System.out.println("Assando " + nome);
    }

    public void fatiar() {
        System.out.println("Fatiando " + nome);
    }

    public void embalar() {
        System.out.println("Embalando " + nome + " na caixa oficial");
    }
}