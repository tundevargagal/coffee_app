package coffeemachine.watertank;

public class WaterTankMock implements IWaterTank {

    private final int waterLevel;
    private int lastWaterRequest;

    public WaterTankMock(int waterLevel) {
        this.waterLevel = waterLevel;
    }

    @Override
    public int currentWaterLevel() {
        return waterLevel;
    }

    @Override
    public int getWater(int requiredWater) {
        return lastWaterRequest = requiredWater;
    }

    public int getLatestWaterRequest() {
        return lastWaterRequest;
    }
}
