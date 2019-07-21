package coffeeMachine.grinder;

import coffee.Coffee;
import coffeeMachine.watertank.IWaterTank;

public class Grinder {

    private IWaterTank waterTank;

    public Grinder(IWaterTank waterTankRef) {
        this.waterTank = waterTankRef;
    }

    public String brew(Coffee coffee) {
        return String.format("Making coffee with %s beans and %s water", coffee.requiredBeans(), coffee.requiredWater());
    }


}
