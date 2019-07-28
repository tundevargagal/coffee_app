package bean;

import coffeemachine.beantank.IBeanTank;

public class BeanTankMock implements IBeanTank {

    private int lastBeanTankRequest;

    @Override
    public int currentBeanTankLevel() {
        return 0;
    }

    @Override
    public int getBeans(int requiredBeans) {
        return lastBeanTankRequest = requiredBeans;
    }

    public int getLatestBeansRequest() {
        return lastBeanTankRequest;
    }
}
