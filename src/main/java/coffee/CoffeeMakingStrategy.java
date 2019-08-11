package coffee;

public interface CoffeeMakingStrategy<T extends Coffee> {
    T makeCoffee();

    int getRequiredWater();

    int getRequiredBeans();

    int getRequiredSteamedMilk();

    int getRequiredFoamedMilk();
}
