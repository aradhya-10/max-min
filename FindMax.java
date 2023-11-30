import java.util.Arrays;
import java.util.Optional;

public class FindMax<T extends Comparable<T>> {
    private T[] values;

    public FindMax(T... values) {
        this.values = values;
    }

    public Optional<T> testMaximum() {
        return findMax(values);
    }

    public static <T extends Comparable<T>> Optional<T> findMax(T... values) {
        if (values.length == 0) {
            return Optional.empty();
        }

        Arrays.sort(values);
        return Optional.of(values[values.length - 1]);
    }

    public static void main(String[] args) {
        FindMax<Integer> intFindMax = new FindMax<>(10, 25, 5, 30, 15);
        Optional<Integer> maxInteger = intFindMax.testMaximum();
        maxInteger.ifPresent(value -> System.out.println("The maximum Integer value is: " + value));

        FindMax<Float> floatFindMax = new FindMax<>(10.5f, 25.3f, 5.7f, 15.2f, 30.8f);
        Optional<Float> maxFloat = floatFindMax.testMaximum();
        maxFloat.ifPresent(value -> System.out.println("The maximum Float value is: " + value));

        FindMax<String> stringFindMax = new FindMax<>("apple", "banana", "cherry", "fig", "grape");
        Optional<String> maxString = stringFindMax.testMaximum();
        maxString.ifPresent(value -> System.out.println("The lexicographically maximum String is: " + value));
    }
}
