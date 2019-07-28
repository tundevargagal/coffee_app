package coffee;

import coffeemachine.steamer.Steamer;

public class LatteMakingStrategy implements CoffeeMakingStrategy {

    private final Steamer steamer;

    public LatteMakingStrategy(Steamer steamer) {
        this.steamer = steamer;
    }

    @Override
    public Coffee makeCoffee() {
        return null;
    }

    @Override
    public int getRequiredWater() {
        return 0;
    }

    @Override
    public int getRequiredBeans() {
        return 0;
    }
}
