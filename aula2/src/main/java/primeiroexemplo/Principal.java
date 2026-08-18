package primeiroexemplo;

import java.util.Scanner;

public class Principal {

    public static void main (String[] args){

        Banco b1 = new Banco("Lucas", "123",2000.0 );
        Banco b2 = new Banco( );

        System.out.println("Teste");

       /* System.out.println(b1.saldo);
        System.out.println(b2.saldo);

        b2.saldo = 3.000;
        System.out.println(b2.saldo);*/

        Banco b3 = new Banco("Thiaguinho", "9372", 2390.50);
        System.out.println(b3.getNome());
        b3.setNome("Juan");
        System.out.println(b3.getNome());

    }
}
