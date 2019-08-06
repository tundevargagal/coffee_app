package coffeemachine.steamer;

import coffee.CoffeeMakingStrategy;
import milktank.MilkTank;

public class Steamer {

    private MilkTank milkTank;

    public Steamer(MilkTank milkTankRef) {
        this.milkTank = milkTankRef;
    }

    public int steamMilk(CoffeeMakingStrategy coffeeMakingStrategy) {
        milkTank.getMilk(coffeeMakingStrategy.getRequiredMilk());
        return coffeeMakingStrategy.getRequiredMilk();
    }
}
