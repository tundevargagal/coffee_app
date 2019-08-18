package coffeemachine.watertank;

public class WaterTank implements IWaterTank {
    private static final int maxLevel = 1000;
    private int currentWaterLevel;

    private WaterTank(final int currentWaterLevel) {
        this.currentWaterLevel = currentWaterLevel;
    }

    public static WaterTank fullTank() {
        return new WaterTank(maxLevel);
    }

    public int currentWaterLevel() {
        return currentWaterLevel;
    }

    public int getWater(int requiredWater) {
        currentWaterLevel -= requiredWater;
        return currentWaterLevel;
    }
}
