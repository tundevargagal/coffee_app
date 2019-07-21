package coffeeMachine.grinder;

import coffeeMachine.watertank.IWaterTank;

public class WaterTankMock implements IWaterTank {

    private int lastWaterRequest;

    @Override
    public int currentWaterLevel() {
        return 0;
    }

    @Override
    public int getWater(int requiredWater) {
        return lastWaterRequest = requiredWater;
    }

    boolean wasCalledWithAmountOfWater(int amount) {
        return lastWaterRequest == amount;
    }
}
