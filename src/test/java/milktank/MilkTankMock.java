package milktank;

public class MilkTankMock implements IMilkTank {

    private final int requiredMilk;

    public MilkTankMock(int requiredMilk) {
        this.requiredMilk = requiredMilk;
    }

    @Override
    public int currentMilkLevel() {
        return requiredMilk;
    }

    @Override
    public int getMilk(int requiredMilk) {
        return 0;
    }
}
