package coffeeMachine;

import coffee.Coffee;
import coffee.CoffeeType;

public class CoffeeMachine {

    private int beansInStock = 0;
    private int milkInStock = 0;

    public Coffee brew(CoffeeType coffeeType) {
        return coffeeType.brew();
    }

    public void restockBeans(int weightInGrams) {
        requirePositiveAmount(weightInGrams);
        beansInStock += weightInGrams;
    }

    public void restockMilk(int weightInGrams) {
        requirePositiveAmount(weightInGrams);
        milkInStock += weightInGrams;
    }

    private void requirePositiveAmount(int value) {
        if (value < 1) {
            throw new IllegalArgumentException("The coffee machine cannot be restocked!");
        }
    }
}
