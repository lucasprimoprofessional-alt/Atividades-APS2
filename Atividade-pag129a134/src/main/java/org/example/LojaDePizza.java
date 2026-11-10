package org.example;

abstract class LojaDePizza {

    Pizza pediPizza(String tipo){
        Pizza pizza = criarPizza(tipo);

        pizza.preparar();
        pizza.assar();
        pizza.fatiar();
        pizza.embalar();

        return pizza;
    }

    abstract Pizza criarPizza(String tipo);

}
