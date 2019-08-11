package coffeemachine;

import coffee.Coffee;
import coffee.CoffeeMakingStrategy;
import coffeetype.CoffeeType;
import org.javatuples.Pair;

import java.util.StringJoiner;

public class CoffeeMachine {

    public <T extends Coffee> Pair<String, T> makeCoffee(CoffeeType<T> coffeeType) {
        StringJoiner result = new StringJoiner("\n");
        // result.add(checkPreRequisities(coffee));
        CoffeeMakingStrategy<T> coffeeMakingStrategy = coffeeType.getCoffeeMakingStrategy();
        T resultCoffee = coffeeMakingStrategy.makeCoffee();
        result.add(resultCoffee.getDescription());
        return Pair.with(result.toString(), resultCoffee);
    }

/*    private String checkPreRequisities(CoffeeType coffee) {
        StringJoiner status = new StringJoiner("\n");
        status.add(checkAvailableWater(coffee));
        status.add(checkAvailableBeans(coffee));
        return status.toString();
    }

    private String checkAvailableWater(CoffeeType coffee) {
        if (COMPONENTS.waterTank.currentWaterLevel() < coffee.getCoffeeMakingStrategy().getRequiredWater()) {
            return "Not enough water";
        }

        return "Enough water available";
    }

    private String checkAvailableBeans(CoffeeType coffee) {
        if (COMPONENTS.beanTank.currentBeanTankLevel() < coffee.getCoffeeMakingStrategy().getRequiredBeans()) {
            return "Not enough beans";
        }

        return "Enough beans available";
    }*/
}
