package coffeeMachine.watertank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WaterTankTest {

    @Test
    void should_get_water() {
        WaterTank waterTank = WaterTank.fullTank();
        int currentWaterLevel = waterTank.getWater(100);
        assertThat(currentWaterLevel).isEqualTo(900);
    }

}