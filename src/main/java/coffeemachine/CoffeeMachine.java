package coffeemachine;

import coffee.Coffee;
import coffeemachine.beantank.BeanTank;
import coffeemachine.beantank.IBeanTank;
import coffeemachine.grinder.Grinder;
import coffeemachine.watertank.IWaterTank;
import coffeetype.CoffeeType;
import org.javatuples.Pair;

import java.util.Optional;
import java.util.StringJoiner;

public class CoffeeMachine {

    private IWaterTank waterTank = CoffeeMachineComponents.INSTANCE.waterTank;
    private IBeanTank beanTank = new BeanTank(250);
    private Grinder grinder = CoffeeMachineComponents.INSTANCE.grinder;

    public Optional<Pair<String, Coffee>> makeCoffee(CoffeeType coffee) {
        StringJoiner result = new StringJoiner("\n");
        result.add(checkPreRequisities(coffee));
        Coffee resultCoffee = coffee.getCoffeeMakingStrategy().makeCoffee();
        result.add(String.format("Made coffee with %s amount of coffee and %s amount of milk steam", resultCoffee.getCoffeeAmount(), resultCoffee.getSteamMilkAmount()));
        return Optional.of(Pair.with(result.toString(), resultCoffee));
    }

    private String checkPreRequisities(CoffeeType coffee) {
        StringJoiner status = new StringJoiner("\n");
        status.add(checkAvailableWater(coffee));
        status.add(checkAvailableBeans(coffee));
        return status.toString();
    }

    private String checkAvailableWater(CoffeeType coffee) {
        if (waterTank.currentWaterLevel() < coffee.getCoffeeMakingStrategy().getRequiredWater()) {
            return "Not enough water";
        }

        return "Enough water available";
    }

    private String checkAvailableBeans(CoffeeType coffee) {
        if (beanTank.currentBeanTankLevel() < coffee.getCoffeeMakingStrategy().getRequiredBeans()) {
            return "Not enough beans";
        }

        return "Enough beans available";
    }
}
