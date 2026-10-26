package simulator;

import behavior.FlyWithWings;

import duck.Duck;
import duck.MallardDuck;
import duck.RubberDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        System.out.println("=== Pato Selvagem ===");
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        mallard.swim();

        System.out.println();
        System.out.println("=== Pato de Borracha ===");
        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performQuack();
        rubber.performFly();
        rubber.swim();

        System.out.println();
        System.out.println("=== Troca dinâmica de comportamento ===");
        System.out.println("Dando asas ao pato de borracha em runtime...");
        rubber.setFlyBehavior(new FlyWithWings());
        rubber.performFly();
    }
}