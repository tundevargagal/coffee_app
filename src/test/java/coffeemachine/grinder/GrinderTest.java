package coffeemachine.grinder;

import bean.BeanTankMock;
import coffeemachine.counters.CounterFromDb;
import coffeemachine.watertank.WaterTankMock;
import coffeetype.EspressoType;
import console.NotEnoughBeansError;
import console.NotEnoughWaterError;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GrinderTest {

    @Test
    void should_get_correct_amount_of_water() {
        WaterTankMock waterTankMock = new WaterTankMock(100);
        new EspressoType(new Grinder(waterTankMock, new BeanTankMock(80), new CounterFromDb())).getCoffeeMakingStrategy().makeCoffee();
        assertThat(waterTankMock.getLatestWaterRequest()).isEqualTo(30);
    }

    @Test
    void should_get_correct_amount_of_beans() {
        BeanTankMock beanTankMock = new BeanTankMock(80);
        new EspressoType(new Grinder(new WaterTankMock(100), beanTankMock, new CounterFromDb())).getCoffeeMakingStrategy().makeCoffee();
        assertThat(beanTankMock.getLatestBeansRequest()).isEqualTo(80);
    }

    @Test
    void should_throw_not_enough_water_error() {
        WaterTankMock waterTankMock = new WaterTankMock(0);
        assertThat(new EspressoType(new Grinder(waterTankMock, new BeanTankMock(80), new CounterFromDb())).getCoffeeMakingStrategy().makeCoffee().getError())
                .isInstanceOf(NotEnoughWaterError.class);
    }

    @Test
    void should_throw_not_enough_beans_error() {
        BeanTankMock beanTankMock = new BeanTankMock(0);
        assertThat(new EspressoType(new Grinder(new WaterTankMock(100), beanTankMock, new CounterFromDb())).getCoffeeMakingStrategy().makeCoffee().getError())
                .isInstanceOf(NotEnoughBeansError.class);
    }

}