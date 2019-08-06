package coffeetype;

import coffeemachine.CoffeeMachineComponents;

public enum CoffeeTypes {

    ESPRESSO(new EspressoType(CoffeeMachineComponents.INSTANCE.grinder)),
    LATTE(new LatteType(CoffeeMachineComponents.INSTANCE.steamer));

    private CoffeeType coffeeType;

    CoffeeTypes(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }

    public CoffeeType getValue() {
        return this.coffeeType;
    }
}
