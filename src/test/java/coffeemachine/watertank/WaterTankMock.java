package coffeemachine.watertank;

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

    public int getLatestWaterRequest() {
        return lastWaterRequest;
    }
}
