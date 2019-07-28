package coffee;

public class Latte extends Coffee {
    private int coffeeAmount;
    private int steamMilkAmount;

    public Latte(int coffeeAmount, int steamMilkAmount) {
        this.coffeeAmount = coffeeAmount;
        this.steamMilkAmount = steamMilkAmount;
    }

    @Override
    public int getCoffeeAmount() {
        return this.coffeeAmount;
    }

    @Override
    public int getSteamMilkAmount() {
        return this.steamMilkAmount;
    }
}
