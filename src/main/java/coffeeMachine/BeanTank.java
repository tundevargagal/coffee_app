package coffeeMachine;

public class BeanTank {
    private int beanLevel;

    public BeanTank(int beanLevel) {
        this.beanLevel = beanLevel;
    }

    public int currentBeanLevel() {
        return beanLevel;
    }
}
