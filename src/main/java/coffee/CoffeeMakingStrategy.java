package coffee;

import console.Result;

public interface CoffeeMakingStrategy<T extends Coffee> {
    Result<T> makeCoffee();

    int getRequiredWater();

    int getRequiredBeans();

    int getRequiredSteamedMilk();

    int getRequiredFoamedMilk();
}
