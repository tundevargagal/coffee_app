package coffeemachine.steamer;

import milk.Milk;
import milk.MilkTank;

public class Steamer {

    private MilkTank milkTank;

    public Steamer(MilkTank milkTankRef) {
        this.milkTank = milkTankRef;
    }

    public int steamMilk(Milk milk) {
        return milkTank.getMilk(226);
    }
}
