package coffeemachine.beantank;

public class BeanTank implements IBeanTank {
    private int currentBeanLevel;
    private static final int maxBeanLevel = 250;

    public BeanTank(int currentBeanLevel) {
        this.currentBeanLevel = currentBeanLevel;
    }

    public static BeanTank fullBeanTank() {
        return new BeanTank(maxBeanLevel);
    }

    @Override
    public int currentBeanTankLevel() {
        return currentBeanLevel;
    }

    @Override
    public int getBeans(int requiredBeans) {
        currentBeanLevel -= requiredBeans;
        return currentBeanLevel;
    }
}
