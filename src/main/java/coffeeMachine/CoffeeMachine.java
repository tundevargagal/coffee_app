package coffeeMachine;

import coffee.Coffee;

import java.util.StringJoiner;

public class CoffeeMachine {

    private WaterTank waterTank = new WaterTank(1000);
    private BeanTank beanTank = new BeanTank(250);
    private Grinder grinder = new Grinder();

    public String brew(Coffee coffee) {
        StringJoiner result = new StringJoiner("\n");
        result.add(checkPreRequisities(coffee));
        result.add(coffee.brew());
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
