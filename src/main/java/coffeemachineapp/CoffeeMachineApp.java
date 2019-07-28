package coffeemachineapp;

import coffee.Coffee;
import coffeemachine.CoffeeMachine;
import coffeetype.CoffeeType;
import org.javatuples.Pair;

public class CoffeeMachineApp {

    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Pair<String, Coffee> coffeeResult = coffeeMachine.makeCoffee(CoffeeType.ESPRESSO);
        System.out.println(coffeeResult);
    }
}
