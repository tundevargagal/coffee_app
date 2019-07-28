package coffeetype;

import coffee.CoffeeMakingStrategy;
import coffee.LatteMakingStrategy;
import coffeemachine.CoffeeMachineComponents;
import coffeemachine.steamer.Steamer;

public class LatteType extends CoffeeType {
    private Steamer steamer;

    public LatteType(Steamer steamer) {
        this.steamer = steamer;
    }

    @Override
    public CoffeeMakingStrategy getCoffeeMakingStrategy() {
        return new LatteMakingStrategy(CoffeeMachineComponents.INSTANCE.steamer);
    }
}
