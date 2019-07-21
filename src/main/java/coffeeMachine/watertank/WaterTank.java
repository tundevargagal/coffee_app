package coffeeMachine.watertank;

public class WaterTank implements IWaterTank {
    private int currentWaterLevel;
    private static final int maxLevel = 1000;

    public WaterTank(final int currentWaterLevel) {
        this.currentWaterLevel = currentWaterLevel;
    }

    public int currentWaterLevel() {
        return currentWaterLevel;
    }

    public int getWater(int requiredWater) {
        currentWaterLevel -= requiredWater;
        return currentWaterLevel;
    }

    public static WaterTank fullTank() {
        return new WaterTank(maxLevel);
    }
}
