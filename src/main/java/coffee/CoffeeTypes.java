package coffee;

import coffeeMachine.CoffeeMachineComponents;

public class CoffeeTypes {

    public static final Coffee ESPRESSO = new Espresso(CoffeeMachineComponents.INSTANCE.getGrinder());


}
