package coffeeMachine.grinder;

import coffee.Coffee;
import coffee.Espresso;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GrinderTest {

    @Test
    void should_brew_espresso() {
        WaterTankMock waterTankMock = new WaterTankMock();
        Coffee espresso = new Espresso(new Grinder(waterTankMock));
        espresso.makeCoffee();
        assertThat(waterTankMock.wasCalledWithAmountOfWater(100)).isTrue();
    }
}