package coffeeMachine;

public class WaterTank {
    private int waterLevel;

    public WaterTank(final int waterLevel) {
        this.waterLevel = waterLevel;
    }

    public int currentWaterLevel() {
        return waterLevel;
    }
}
