package console;

import org.javatuples.Pair;
import org.javatuples.Triplet;

import java.util.Objects;
import java.util.function.Function;

public class Result<T> {

    private T value;
    private Error error;

    private Result(T value, Error error) {
        this.value = value;
        this.error = error;
    }

    public static <U> Result<U> success(U value) {
        return new Result<>(value, null);
    }

    public static <U> Result<U> error(Error error) {
        return new Result<>(null, error);
    }

    public <U> Result<U> flatMap(Function<T, Result<U>> mapper) {
        if (this.isError()) {
            return Result.error(getError());
        }

        return mapper.apply(value);
    }

    public <U> Result<U> map(Function<? super T, ? extends U> mapper) {
        if (this.isError()) {
            return Result.error(getError());
        }
        return Result.success(mapper.apply(value));
    }

    <T2> Result<Pair<T, T2>> zip(Result<T2> t2) {
        if (this.isSuccess() && t2.isSuccess()) {
            return Result.success(Pair.with(this.value, t2.value));
        } else if (this.isError()) {
            return Result.error(getError());
        } else {
            return Result.error(t2.error);
        }
    }

    public <T2, T3> Result<Triplet<T, T2, T3>> zip(Result<T2> t2, Result<T3> t3) {
        if (this.isSuccess() && t2.isSuccess()) {
            return Result.success(Triplet.with(this.value, t2.value, t3.value));
        } else if (this.isError()) {
            return Result.error(getError());
        } else if (this.isError()) {
            return Result.error(t2.error);
        }
        return Result.error(t3.error);
    }

    boolean isError() {
        return Objects.nonNull(error) && Objects.isNull(value);
    }

    private boolean isSuccess() {
        return Objects.nonNull(value) && Objects.isNull(error);
    }

    public T getValue() {
        return value;
    }

    public Error getError() {
        return error;
    }

}
