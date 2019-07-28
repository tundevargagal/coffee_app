package coffeemachine.grinder;

import bean.BeanTankMock;
import coffeemachine.watertank.WaterTankMock;
import coffeetype.EspressoType;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GrinderTest {

    @Test
    void should_get_correct_amount_of_water() {
        WaterTankMock waterTankMock = new WaterTankMock();
        new EspressoType(new Grinder(waterTankMock, new BeanTankMock())).getCoffeeMakingStrategy().makeCoffee();
        assertThat(waterTankMock.getLatestWaterRequest()).isEqualTo(150);
    }

    @Test
    void should_get_correct_amount_of_beans() {
        BeanTankMock beanTankMock = new BeanTankMock();
        new EspressoType(new Grinder(new WaterTankMock(), beanTankMock)).getCoffeeMakingStrategy().makeCoffee();
        assertThat(beanTankMock.getLatestBeansRequest()).isEqualTo(100);
    }

}