package duck;

import behavior.FlyNoWay;
import behavior.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new Squeak();    // squeak
        flyBehavior   = new FlyNoWay();  // não voa
    }

    @Override
    public void display() {
        System.out.println("Eu sou um Pato de Borracha.");
    }
}