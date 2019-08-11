package coffeetype;

import coffee.CoffeeMakingStrategy;
import coffee.Espresso;
import coffee.EspressoMakingStrategy;
import coffeemachine.grinder.Grinder;

public class EspressoType extends CoffeeType<Espresso> {
    private Grinder grinder;

    public EspressoType(Grinder grinder) {
        this.grinder = grinder;
    }

    @Override
    public CoffeeMakingStrategy<Espresso> getCoffeeMakingStrategy() {
        return new EspressoMakingStrategy(this.grinder);
    }
}
