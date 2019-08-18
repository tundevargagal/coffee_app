package coffee;

import coffeemachine.grinder.Grinder;
import coffeemachine.steamer.Steamer;
import console.Result;

public class LatteMakingStrategy implements CoffeeMakingStrategy<Latte> {

    private final Steamer steamer;
    private Grinder grinder;
    private int requiredWater = 30;
    private int requiredBeans = 80;
    private int requiredSteamedMilk = 240;
    private int requiredFoamedMilk = 30;

    public LatteMakingStrategy(Grinder grinder, Steamer steamer) {
        this.grinder = grinder;
        this.steamer = steamer;
    }

    @Override
    public Result<Latte> makeCoffee() {
        return grinder.brew(this)
                .zip(steamer.steamMilk(this), steamer.foamedMilk(this))
                .map(triplet -> new Latte(triplet.getValue0(), triplet.getValue1(), triplet.getValue2()));
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
