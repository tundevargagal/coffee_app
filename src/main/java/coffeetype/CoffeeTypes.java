package coffeetype;

import coffeemachine.CoffeeMachineComponents;

final class CoffeeTypes {

    final static EspressoType ESPRESSO = new EspressoType(CoffeeMachineComponents.COMPONENTS.grinder);
    final static LatteType LATTE = new LatteType(CoffeeMachineComponents.COMPONENTS.steamer);

}
