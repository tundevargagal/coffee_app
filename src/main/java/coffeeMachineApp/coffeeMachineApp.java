package coffeeMachineApp;

import coffee.CoffeeType;
import coffeeMachine.CoffeeMachine;

public class coffeeMachineApp {

    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.brew(CoffeeType.ESPRESSO);
    }
}
