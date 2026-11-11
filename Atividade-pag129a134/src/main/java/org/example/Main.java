package org.example;

import org.example.Lojas.LojaDePizzaChicago;
import org.example.Lojas.LojaDePizzaNovaYork;

public class Main {
    public static void main(String[] args) {

        System.out.println("========== LOJA DE NOVA YORK ==========");
        LojaDePizza lojaNovaYork = new LojaDePizza() {
            @Override
            protected Pizza criarPizza(String tipo) {
                return null;
            }
        };

        // A loja de NY cria a pizza de queijo
        System.out.println("\nPedindo uma pizza de queijo:");
        lojaNovaYork.pedirPizza("queijo");

        System.out.println("\n========== LOJA DE CHICAGO ==========");
        LojaDePizza lojaChicago = new LojaDePizzaChicago();

        // A loja de Chicago cria a pizza de calabresa
        System.out.println("\nPedindo uma pizza de calabresa:");
        lojaChicago.pedirPizza("calabresa");

        // Testando o erro (a loja de Chicago não vende queijo)
        System.out.println("\nPedindo uma pizza de queijo em Chicago (não deve existir):");
        lojaChicago.pedirPizza("queijo");
    }
}