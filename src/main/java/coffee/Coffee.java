package coffee;

import water.Water;

public class Coffee {

    private final Water water;
    private final CoffeeType coffeeType;
    private final int beans;
    private final int milk;

    public Coffee(Water water, CoffeeType coffeeTypeRef, int beansRef, int milkRef) {
        this.water = water;
        this.coffeeType = coffeeTypeRef;
        this.beans = beansRef;
        this.milk = milkRef;
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public int getBeans() {
        return beans;
    }

    public int getMilk() {
        return milk;
    }

    @Override
    public String toString() {
        return "Coffee " + "type: "+ coffeeType + "beans: " + beans + "milk: " + milk;
    }
}
