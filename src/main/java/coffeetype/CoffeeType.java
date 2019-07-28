package coffeetype;

import coffee.CoffeeMakingStrategy;
import coffeemachine.CoffeeMachineComponents;

public abstract class CoffeeType {
    public abstract CoffeeMakingStrategy getCoffeeMakingStrategy();

    public static CoffeeType ESPRESSO = new EspressoType(CoffeeMachineComponents.INSTANCE.grinder);
    public static CoffeeType LATTE = new LatteType(CoffeeMachineComponents.INSTANCE.steamer);

}
