package coffeemachine;

import coffee.Espresso;
import coffee.Latte;
import coffeemachine.beantank.BeanTank;
import coffeemachine.watertank.WaterTank;
import coffeetype.CoffeeTypesEnum;
import console.Result;
import milktank.MilkTank;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CoffeeMachineTest {

    @Test
    void should_brew_espresso() {
        WaterTank waterTank = WaterTank.fullTank();
        BeanTank beanTank = BeanTank.fullBeanTank();
        Result<Espresso> coffeeMakingResult = new CoffeeMachine().makeCoffee(CoffeeTypesEnum.ESPRESSO.getValue());
        assertThat(coffeeMakingResult.getValue().getCoffeeAmount()).isEqualTo(38);
    }

    @Test
    void should_make_cafe_latte() {
        WaterTank waterTank = WaterTank.fullTank();
        BeanTank beanTank = BeanTank.fullBeanTank();
        MilkTank milkTank = MilkTank.fullMilkTank();
        Result<Latte> coffeeResult = new CoffeeMachine().makeCoffee(CoffeeTypesEnum.LATTE.getValue());
        Latte latte = coffeeResult.getValue();
        assertThat(latte.getCoffeeAmount()).isEqualTo(38);
        assertThat(latte.getSteamedMilkAmount()).isEqualTo(510);
        assertThat(latte.getFoamedMilkAmount()).isEqualTo(480);
    }

}
