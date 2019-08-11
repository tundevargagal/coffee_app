package coffeetype;

import coffee.CoffeeMakingStrategy;
import coffee.Latte;
import coffee.LatteMakingStrategy;
import coffeemachine.CoffeeMachineComponents;
import coffeemachine.steamer.Steamer;

public class LatteType extends CoffeeType<Latte> {
    private Steamer steamer;

    public LatteType(Steamer steamer) {
        this.steamer = steamer;
    }

    @Override
    public CoffeeMakingStrategy<Latte> getCoffeeMakingStrategy() {
        return new LatteMakingStrategy(CoffeeMachineComponents.COMPONENTS.grinder, CoffeeMachineComponents.COMPONENTS.steamer);
    }
}
