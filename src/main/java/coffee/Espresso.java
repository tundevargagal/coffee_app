package coffee;

public class Espresso extends Coffee implements HasCoffee {
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
    public String getDescription() {
        return String.format("Made coffee with %s amount of coffee", this.getCoffeeAmount());
    }
}
