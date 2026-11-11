package org.example;

public abstract class LojaDePizza {

    public Pizza pedirPizza(String tipo) {
        Pizza pizza = criarPizza(tipo);

        if (pizza != null) {
            pizza.preparar();
            pizza.assar();
            pizza.fatiar();
            pizza.embalar();
        } else {
            System.out.println("Desculpe, não temos o sabor: " + tipo);
        }

        return pizza;
    }

    protected abstract Pizza criarPizza(String tipo);
}