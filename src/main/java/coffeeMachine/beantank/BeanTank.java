package coffeeMachine.beantank;

public class BeanTank {
    private int currentBeanLevel;
    private static final int maxBeanLevel = 250;

    public BeanTank(int currentBeanLevel) {
        this.currentBeanLevel = currentBeanLevel;
    }

    public int currentBeanLevel() {
        return currentBeanLevel;
    }

    public int getBeanTankLevel(int requiredBeans) {
        currentBeanLevel -= requiredBeans;
        return currentBeanLevel;
    }

    public static BeanTank fullBeanTank() {
        return new BeanTank(maxBeanLevel);
    }
}
