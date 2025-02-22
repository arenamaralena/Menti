package ModulSix;

import java.util.Objects;

public final class Pair<First, Second> {
    private final First valueOfFirst;
    private final Second valueOfSecond;

    public Pair(First valueOfFirst, Second valueOfSecond) {
        this.valueOfFirst = valueOfFirst;
        this.valueOfSecond = valueOfSecond;
    }

    public static <First, Second> Pair<First, Second> of(First valueOfFirst, Second valueOfSecond) {
        return new Pair<>(valueOfFirst, valueOfSecond);
    }

    public First getFirst() {
        return valueOfFirst;
    }

    public Second getSecond() {
        return valueOfSecond;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (getClass() != object.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) object;
        return Objects.equals(valueOfFirst, pair.valueOfFirst) && Objects.equals(valueOfSecond, pair.valueOfSecond);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valueOfFirst, valueOfSecond);
    }
}
