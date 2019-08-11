package coffee;

public class Latte extends Coffee implements HasCoffee, HasSteamedMilk, HasFoamedMilk {
    private int coffeeAmount;
    private int steamedMilkAmount;
    private int foamedMilkAmount;

    public Latte(int coffeeAmount, int steamedMilkAmount, int foamedMilkAmount) {
        this.coffeeAmount = coffeeAmount;
        this.steamedMilkAmount = steamedMilkAmount;
        this.foamedMilkAmount = foamedMilkAmount;
    }

    @Override
    public int getCoffeeAmount() {
        return this.coffeeAmount;
    }

    @Override
    public int getSteamedMilkAmount() {
        return this.steamedMilkAmount;
    }


    @Override
    public int getFoamedMilkAmount() {
        return this.foamedMilkAmount;
    }

    @Override
    public String getDescription() {
        return String.format("Made coffee with %s amount of coffee and %s amount of milk steam", this.getCoffeeAmount(), this.getSteamedMilkAmount());
    }
}