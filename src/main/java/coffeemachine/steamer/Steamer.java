package coffeemachine.steamer;

import coffee.CoffeeMakingStrategy;
import coffee.LatteMakingStrategy;
import milktank.MilkTank;

public class Steamer {

    private MilkTank milkTank;

    public Steamer(MilkTank milkTankRef) {
        this.milkTank = milkTankRef;
    }

    public int steamMilk(CoffeeMakingStrategy coffeeMakingStrategy) {
        return milkTank.getMilk(coffeeMakingStrategy.getRequiredSteamedMilk());
    }

    public int foamedMilk(LatteMakingStrategy strategy) {
        return milkTank.getMilk(strategy.getRequiredFoamedMilk());
    }
}
