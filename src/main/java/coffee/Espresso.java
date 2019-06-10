package coffee;

import coffeeMachine.Grinder;

public class Espresso extends Coffee {

    private final int requiredBeans = 80;
    private final int requiredMilk = 0;
    private final int requiredWater = 150;
    private final Grinder grinder;

    public Espresso(Grinder grinder) {
        this.grinder = grinder;
    }

    @Override
    public String brew() {
        return grinder.makeCoffee(this);
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
