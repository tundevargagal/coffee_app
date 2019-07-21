package coffee;

public class Latte extends Coffee {

    private final int requiredBeans = 80;

    private final int requiredMilk = 226;

    private final int requiredWater = 150;

    Latte() {

    }

    @Override
    public String makeCoffee() {
        return "";
    }

    @Override
    public int requiredWater() {
        return 0;
    }

    @Override
    public int requiredBeans() {
        return 0;
    }

}
