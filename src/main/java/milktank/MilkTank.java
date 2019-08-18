package milktank;

public class MilkTank implements IMilkTank {

    private static int maxMilkLevel = 750;
    private int currentMilkLevel;

    private MilkTank(int currentMilkLevel) {
        this.currentMilkLevel = currentMilkLevel;
    }

    public static MilkTank fullMilkTank() {
        return new MilkTank(maxMilkLevel);
    }

    @Override
    public int currentMilkLevel() {
        return currentMilkLevel;
    }

    @Override
    public int getMilk(int requiredMilk) {
        return currentMilkLevel -= requiredMilk;
    }
}
