package coffeeMachine;

import coffee.Coffee;

public class Grinder {

    public String makeCoffee(Coffee coffee) {
        return String.format("Making coffee with %s beans and %s water", coffee.requiredBeans(), coffee.requiredWater());
    }
}
