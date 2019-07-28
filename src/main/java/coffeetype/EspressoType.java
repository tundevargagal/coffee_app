package coffeetype;

import coffee.CoffeeMakingStrategy;
import coffee.EspressoMakingStrategy;
import coffeemachine.grinder.Grinder;

public class EspressoType extends CoffeeType {
    private Grinder grinder;

    public EspressoType(Grinder grinder) {
        this.grinder = grinder;
    }

    @Override
    public CoffeeMakingStrategy getCoffeeMakingStrategy() {
        return new EspressoMakingStrategy(this.grinder);
    }
}
