package coffeemachine;

import coffee.Coffee;
import coffeemachine.beantank.BeanTank;
import coffeemachine.watertank.WaterTank;
import coffeetype.CoffeeType;
import org.javatuples.Pair;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoffeeMachineTest {

    @Test
    void should_brew_espresso() {
        WaterTank waterTank = WaterTank.fullTank();
        BeanTank beanTank = BeanTank.fullBeanTank();
        Pair<String, Coffee> coffeeMakingResult = new CoffeeMachine().makeCoffee(CoffeeType.ESPRESSO);
        assertThat(coffeeMakingResult.getValue1().getCoffeeAmount()).isEqualTo(151);
    }
}
