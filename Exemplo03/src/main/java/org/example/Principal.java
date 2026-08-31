package org.example;

public class Principal {
    public static void main (String[] args){
        Carro carro = new Carro();
        Bicicleta bicicleta = new Bicicleta();
        Pista pista = new Pista();

        System.out.println(pista.iniciarCorrida(carro));
        System.out.println(pista.iniciarCorrida(bicicleta));
    }
}
