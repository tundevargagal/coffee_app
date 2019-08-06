package coffeemachine.counters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterFromDbTest {

    @Test
    void should_get_water_count() {
        assertThat(new CounterFromDb().getWaterCount()).isEqualTo(1);
    }
}