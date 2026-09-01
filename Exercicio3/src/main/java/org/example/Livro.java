package org.example;

public class Livro extends Produto {

    private String autor;

    public Livro(String nome, double preco) {
        super(nome, preco);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
