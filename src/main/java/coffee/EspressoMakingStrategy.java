package coffee;

import coffeemachine.grinder.Grinder;

public class EspressoMakingStrategy implements CoffeeMakingStrategy<Espresso> {
    private final Grinder grinder;
    private int requiredWater = 30;
    private int requiredBeans = 80;

    public EspressoMakingStrategy(Grinder grinder) {
        this.grinder = grinder;
    }

    @Override
    public Espresso makeCoffee() {
        return new Espresso(grinder.brew(this));
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
        return 0;
    }

    @Override
    public int getRequiredFoamedMilk() {
        return 0;
    }
}
