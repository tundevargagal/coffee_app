package console;

import org.javatuples.Pair;
import org.javatuples.Triplet;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ResultTest {

    @Test
    void should_bi_zip() {
        Result<String> a = Result.success("a");
        Result<String> b = Result.success("b");

        assertThat(a.zip(b)).extracting(Result::getValue).isEqualTo(Pair.with("a", "b"));

    }

    @Test
    void should_tri_zip() {
        Result<String> a = Result.success("a");
        Result<String> b = Result.success("b");
        Result<String> c = Result.success("c");

        assertThat(a.zip(b, c)).extracting(Result::getValue).isEqualTo(Triplet.with("a", "b", "c"));

    }

    @Test
    void should_bi_zip_with_error() {
        Result<String> a = Result.success("a");
        NotEnoughMilkError error = new NotEnoughMilkError();
        Result<String> b = Result.error(error);

        assertThat(a.zip(b)).extracting(Result::getError).isEqualTo(error);

    }
}