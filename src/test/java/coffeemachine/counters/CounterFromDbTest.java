package coffeemachine.counters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterFromDbTest {

    private CounterFromDb counterFromDb;

    @BeforeEach
    void beforeEach() {
        counterFromDb = new CounterFromDb();
        counterFromDb.setWaterCount(100);
    }

    @Test
    void should_get_water_count() {
        assertThat(counterFromDb.getWaterCount()).isEqualTo(100);
    }

    @Test
    void should_set_discale_count() {
        counterFromDb.setWaterCount(200);
        assertThat(counterFromDb.getWaterCount()).isEqualTo(200);
    }
}