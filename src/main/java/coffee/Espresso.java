package coffee;

import coffeeMachine.grinder.Grinder;

public class Espresso extends Coffee {

    private final int requiredBeans = 80;
    private final int requiredMilk = 0;
    private final int requiredWater = 150;
    private final Grinder grinder;

    public Espresso(Grinder grinder) {
        this.grinder = grinder;
    }

    @Override
    public String makeCoffee() {
        return grinder.brew(this);
    }

    @Override
    public int requiredWater() {
        return requiredWater;
    }

    @Override
    public int requiredBeans() {
        return requiredBeans;
    }


}
