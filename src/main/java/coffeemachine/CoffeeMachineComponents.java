package coffeemachine;

import coffeemachine.beantank.BeanTank;
import coffeemachine.grinder.Grinder;
import coffeemachine.steamer.Steamer;
import coffeemachine.watertank.WaterTank;
import milk.MilkTank;

public enum CoffeeMachineComponents {

    INSTANCE;

    public final WaterTank waterTank = WaterTank.fullTank();
    public final BeanTank beanTank = BeanTank.fullBeanTank();
    public final MilkTank milkTank = MilkTank.fullMilkTank();

    public final Grinder grinder = new Grinder(waterTank, beanTank);
    public final Steamer steamer = new Steamer(milkTank);
}