package bean;

import coffeemachine.beantank.IBeanTank;

public class BeanTankMock implements IBeanTank {

    private final int currentBeans;
    private int lastBeanTankRequest;

    public BeanTankMock(int currentBeans) {
        this.currentBeans = currentBeans;
    }

    @Override
    public int currentBeanTankLevel() {
        return currentBeans;
    }

    @Override
    public int getBeans(int requiredBeans) {
        return lastBeanTankRequest = requiredBeans;
    }

    public int getLatestBeansRequest() {
        return lastBeanTankRequest;
    }
}
