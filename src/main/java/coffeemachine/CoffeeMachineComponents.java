package coffeemachine;

import coffeemachine.beantank.BeanTank;
import coffeemachine.counters.Counter;
import coffeemachine.counters.CounterFromMem;
import coffeemachine.grinder.Grinder;
import coffeemachine.milktank.MilkTank;
import coffeemachine.steamer.Steamer;
import coffeemachine.watertank.WaterTank;

public enum CoffeeMachineComponents {

    COMPONENTS;

    public final WaterTank waterTank = WaterTank.fullTank();
    public final BeanTank beanTank = BeanTank.fullBeanTank();
    public final MilkTank milkTank = MilkTank.fullMilkTank();

    public final Counter counter = new CounterFromMem();

    public final Grinder grinder = new Grinder(waterTank, beanTank, counter);
    public final Steamer steamer = new Steamer(milkTank);
}
