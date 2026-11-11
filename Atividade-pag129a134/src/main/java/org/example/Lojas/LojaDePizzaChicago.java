package org.example.Lojas;

import org.example.LojaDePizza;
import org.example.Pizza;
import org.example.Sabores.PizzaDeCalabresa;
import org.example.Sabores.PizzaDeFrango;

public class LojaDePizzaChicago extends LojaDePizza {

        @Override
        protected Pizza criarPizza(String tipo) {
            if (tipo.equalsIgnoreCase("calabresa")) {
                return new PizzaDeCalabresa();
            } else if (tipo.equalsIgnoreCase("frango")) {
                return new PizzaDeFrango();
            }
            // Chicago não vende de queijo nesse exemplo
            return null;
        }
    }

