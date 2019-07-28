package coffee;

public class Espresso extends Coffee {
    private final int coffeeAmount;

    public Espresso(int coffeeAmount) {
        this.coffeeAmount = coffeeAmount;
    }

    public Espresso() {
        coffeeAmount = 0;
    }

    @Override
    public int getCoffeeAmount() {
        return coffeeAmount;
    }

    @Override
    public int getSteamMilkAmount() {
        return 0;
    }
}
