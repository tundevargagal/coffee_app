package coffee;

import coffeemachine.grinder.Grinder;
import coffeemachine.steamer.Steamer;

public class LatteMakingStrategy implements CoffeeMakingStrategy {

    private Grinder grinder;
    private final Steamer steamer;
    private int requiredWater = 30;
    private int requiredBeans = 80;
    private int requiredMilk = 220;

    public LatteMakingStrategy(Grinder grinder, Steamer steamer) {
        this.grinder = grinder;
        this.steamer = steamer;
    }

    @Override
    public Coffee makeCoffee() {
        return new Latte(grinder.brew(this), steamer.steamMilk(this));
    }

    @Override
    public int getRequiredWater() {
        return this.requiredWater;
    }

    @Override
    public int getRequiredBeans() {
        return this.requiredBeans;
    }

    @Override
    public int getRequiredMilk() {
        return this.requiredMilk;
    }
}
