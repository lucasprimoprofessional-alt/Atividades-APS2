package duck;

import behavior.FlyWithWings;
import behavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();          // grasna
        flyBehavior   = new FlyWithWings();   // voa com asas
    }

    @Override
    public void display() {
        System.out.println("Eu sou um Pato Selvagem (Mallard).");
    }
}