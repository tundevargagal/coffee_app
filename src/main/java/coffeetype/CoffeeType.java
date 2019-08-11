package coffeetype;

import coffee.Coffee;
import coffee.CoffeeMakingStrategy;

public abstract class CoffeeType<T extends Coffee> {
    public abstract CoffeeMakingStrategy<T> getCoffeeMakingStrategy();

}
