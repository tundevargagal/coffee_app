package bean;

import coffeemachine.beantank.BeanTank;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BeanTankTest {

    @Test
    void should_get_beans() {
        BeanTank beanTank = BeanTank.fullBeanTank();
        int currentBeanTankLevel = beanTank.getBeans(50);
        assertThat(currentBeanTankLevel).isEqualTo(200);
    }
}
