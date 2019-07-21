package coffeeMachine;

import coffee.Coffee;
import coffeeMachine.beantank.BeanTank;
import coffeeMachine.grinder.Grinder;
import coffeeMachine.watertank.WaterTank;

import java.util.StringJoiner;

public class CoffeeMachine {

    private WaterTank waterTank = CoffeeMachineComponents.INSTANCE.waterTank;
    private BeanTank beanTank = new BeanTank(250);
    private Grinder grinder = CoffeeMachineComponents.INSTANCE.grinder;

    public String brew(Coffee coffee) {
        StringJoiner result = new StringJoiner("\n");
        result.add(checkPreRequisities(coffee));
        result.add(coffee.makeCoffee());
        return result.toString();
    }

    private String checkPreRequisities(Coffee coffee) {
        StringJoiner status = new StringJoiner("\n");
        status.add(checkAvailableWater(coffee));
        status.add(checkAvailableBeans(coffee));
        return status.toString();
    }

    private String checkAvailableWater(Coffee coffee) {
        if (waterTank.currentWaterLevel() < coffee.requiredWater()) {
            return "Not enough water";
        }

        return "Enough water available";
    }

    private String checkAvailableBeans(Coffee coffee) {
        if (beanTank.currentBeanLevel() < coffee.requiredBeans()) {
            return "Not enough beans";
        }

        return "Enough beans available";
    }
}
