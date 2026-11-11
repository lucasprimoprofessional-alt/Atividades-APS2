package org.example.Lojas;

import org.example.LojaDePizza;
import org.example.Pizza;
import org.example.Sabores.PizzaDeCalabresa;
import org.example.Sabores.PizzaDeFrango;
import org.example.Sabores.PizzaDeQueijo;

public class LojaDePizzaNovaYork extends LojaDePizza {

        @Override
        protected Pizza criarPizza(String tipo) {
            if (tipo.equalsIgnoreCase("calabresa")) {
                return new PizzaDeCalabresa();
            } else if (tipo.equalsIgnoreCase("frango")) {
                return new PizzaDeFrango();
            } else if (tipo.equalsIgnoreCase("queijo")) {
                return new PizzaDeQueijo();
            }
            return null;
        }
    }

