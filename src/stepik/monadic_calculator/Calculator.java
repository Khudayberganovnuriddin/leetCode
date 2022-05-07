package stepik.monadic_calculator;

import java.util.function.Consumer;
import java.util.function.Function;

class Calculator<T extends Number> {
    private static final Calculator<?> BROKEN_CALCULATOR = new Calculator<>(true);
    private final T value;
    private final boolean hasError;

    private Calculator(T value) {
        this.value = value;
        this.hasError = false;
    }

    private Calculator(boolean hasError) {
        this.value = null;
        this.hasError = hasError;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Number> Calculator<T> getBrokenCalculator() {
        return (Calculator<T>) BROKEN_CALCULATOR;
    }

    public static <T extends Number> Calculator<T> of(T value) {
        return new Calculator<>(value);
    }

    public <U extends Number> Calculator<T> eval(Function<? super T, ? extends U> mapper) {
        mapper.apply(value);
        return new Calculator<>(value);
    }

    public Calculator<T> consume(Consumer<T> consumer) {
        // code ??
        return getBrokenCalculator();
    }
}
