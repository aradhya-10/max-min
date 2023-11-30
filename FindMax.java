public class FindMax<T extends Comparable<T>> {
    private T var1;
    private T var2;
    private T var3;

    public FindMax(T var1, T var2, T var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public T testMaximum() {
        return FindMax.findMax(var1, var2, var3);
    }

    public static <T extends Comparable<T>> T findMax(T var1, T var2, T var3) {
        T max = var1;

        if (var2.compareTo(max) > 0) {
            max = var2;
        }

        if (var3.compareTo(max) > 0) {
            max = var3;
        }

        return max;
    }

    public static void main(String[] args) {
        FindMax<Integer> intFindMax = new FindMax<>(10, 25, 5);
        Integer maxInteger = intFindMax.testMaximum();
        System.out.println("The maximum Integer value is: " + maxInteger);

        FindMax<Float> floatFindMax = new FindMax<>(10.5f, 25.3f, 5.7f);
        Float maxFloat = floatFindMax.testMaximum();
        System.out.println("The maximum Float value is: " + maxFloat);

        FindMax<String> stringFindMax = new FindMax<>("apple", "banana", "cherry");
        String maxString = stringFindMax.testMaximum();
        System.out.println("The lexicographically maximum String is: " + maxString);
    }
}
