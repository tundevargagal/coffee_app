package coffeemachine;

import coffee.Coffee;
import coffeetype.CoffeeType;
import console.Result;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CoffeeMachine {
    public <T extends Coffee, C extends CoffeeType> Result<T> makeCoffee(CoffeeType<T> coffeeType) {
        return coffeeType.getCoffeeMakingStrategy().makeCoffee();
    }

    public String getStatus() {
        return Stream.of("Der Bohnenbehälter ist bei: " + CoffeeMachineComponents.COMPONENTS.beanTank.currentBeanTankLevel(),
                "Der Wasserbehälter ist bei: " + CoffeeMachineComponents.COMPONENTS.waterTank.currentWaterLevel(),
                "Der Milchbehälter ist bei: " + CoffeeMachineComponents.COMPONENTS.milkTank.currentMilkLevel(),
                "Bezüge bis zur Entkalkung: " + CoffeeMachineComponents.COMPONENTS.counter.getWaterCount())
                .collect(Collectors.joining("\n"));
    }

    public String maintain() {
        CoffeeMachineComponents.COMPONENTS.counter.setWaterCount(100);
        return String.format("%d Bezüge bis zur Entkalkung", CoffeeMachineComponents.COMPONENTS.counter.getWaterCount());
    }
}
