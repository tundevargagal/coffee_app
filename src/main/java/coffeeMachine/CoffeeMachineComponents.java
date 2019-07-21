package coffeeMachine;

import coffeeMachine.grinder.Grinder;
import coffeeMachine.watertank.WaterTank;

public enum CoffeeMachineComponents {

    INSTANCE;

    public final WaterTank waterTank = WaterTank.fullTank();

    public final Grinder grinder = new Grinder(waterTank);
}
