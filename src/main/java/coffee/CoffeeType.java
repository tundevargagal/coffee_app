package coffee;

public enum CoffeeType {

    ESPRESSO(80, 0) {
        @Override
        public Coffee brew() {
            return ;
        }
    };
 /*   CAFE_LATTE(80, 227) {

    },
    CAPPUCCINO() {

    },
    CAFE_AMERICANO() {

    },
    MOCHACCINO() {

    };*/

    private final int requiredBeans;
    private final int requiredMilk;

    CoffeeType(int requiredBeansRef, int requiredMilkRef) {
        this.requiredBeans = requiredBeansRef;
        this.requiredMilk = requiredMilkRef;
    }

    public int getRequiredBeans() {
        return requiredBeans;
    }

    public int getRequiredMilk() {
        return requiredMilk;
    }

    public abstract Coffee brew();

}
