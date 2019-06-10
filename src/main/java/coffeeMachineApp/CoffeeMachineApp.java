package coffeeMachineApp;

import coffee.CoffeeTypes;
import coffee.Espresso;
import coffeeMachine.CoffeeMachine;

public class CoffeeMachineApp {

    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        String coffeeResult = coffeeMachine.brew(CoffeeTypes.ESPRESSO);
        System.out.println(coffeeResult);
    }
}
