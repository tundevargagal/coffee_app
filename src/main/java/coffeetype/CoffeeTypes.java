package coffeetype;

import coffeemachine.CoffeeMachineComponents;

public enum CoffeeTypes {

    ESPRESSO(new EspressoType(CoffeeMachineComponents.COMPONENTS.grinder)),
    LATTE(new LatteType(CoffeeMachineComponents.COMPONENTS.steamer));

    private CoffeeType coffeeType;

    CoffeeTypes(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }

    public CoffeeType getValue() {
        return this.coffeeType;
    }
}
