package coffeemachine.grinder;

import coffee.CoffeeMakingStrategy;
import coffeemachine.beantank.IBeanTank;
import coffeemachine.watertank.IWaterTank;

public class Grinder {

    private IWaterTank waterTank;
    private IBeanTank beanTank;

    public Grinder(IWaterTank waterTankRef, IBeanTank beanTankRef) {
        this.waterTank = waterTankRef;
        this.beanTank = beanTankRef;
    }

    public int brew(CoffeeMakingStrategy coffeeMakingStrategy) {
        waterTank.getWater(coffeeMakingStrategy.getRequiredWater());
        beanTank.getBeans(coffeeMakingStrategy.getRequiredBeans());
        return coffeeMakingStrategy.getRequiredWater() + (coffeeMakingStrategy.getRequiredBeans() / 10);
    }
}
