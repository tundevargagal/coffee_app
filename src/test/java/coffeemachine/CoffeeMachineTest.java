package coffeemachine;

import coffee.Espresso;
import coffee.Latte;
import coffeemachine.beantank.BeanTank;
import coffeemachine.watertank.WaterTank;
import coffeetype.CoffeeTypes;
import milktank.MilkTank;
import org.javatuples.Pair;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoffeeMachineTest {

    @Test
    void should_brew_espresso() {
        WaterTank waterTank = WaterTank.fullTank();
        BeanTank beanTank = BeanTank.fullBeanTank();
        Pair<String, Espresso> coffeeMakingResult = new CoffeeMachine().makeCoffee(CoffeeTypes.ESPRESSO.getValue());
        assertThat(coffeeMakingResult.getValue1().getCoffeeAmount()).isEqualTo(38);
    }

    @Test
    void should_make_cafe_latte() {
        WaterTank waterTank = WaterTank.fullTank();
        BeanTank beanTank = BeanTank.fullBeanTank();
        MilkTank milkTank = MilkTank.fullMilkTank();
        Pair<String, Latte> coffeeResult = new CoffeeMachine().makeCoffee(CoffeeTypes.LATTE.getValue());
        Latte latte = coffeeResult.getValue1();
        assertThat(latte.getCoffeeAmount()).isEqualTo(80);
        assertThat(latte.getSteamedMilkAmount()).isEqualTo(240);
        assertThat(latte.getFoamedMilkAmount()).isEqualTo(240);
    }
}
