package coffee;

import coffeemachine.grinder.Grinder;
import coffeemachine.steamer.Steamer;

public class LatteMakingStrategy implements CoffeeMakingStrategy<Latte> {

    private Grinder grinder;
    private final Steamer steamer;
    private int requiredWater = 30;
    private int requiredBeans = 80;
    private int requiredSteamedMilk = 240;
    private int requiredFoamedMilk = 30;

    public LatteMakingStrategy(Grinder grinder, Steamer steamer) {
        this.grinder = grinder;
        this.steamer = steamer;
    }

    @Override
    public Latte makeCoffee() {
        return new Latte(grinder.brew(this), steamer.steamMilk(this), steamer.foamedMilk(this));
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
    public int getRequiredSteamedMilk() {
        return this.requiredSteamedMilk;
    }

    @Override
    public int getRequiredFoamedMilk() {
        return this.requiredFoamedMilk;
    }
}
