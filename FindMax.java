public class FindMax {

    public static <T extends Comparable<T>> T findMax(T obj1, T obj2, T obj3) {
        T max = obj1;

        if (obj2.compareTo(max) > 0) {
            max = obj2;
        }

        if (obj3.compareTo(max) > 0) {
            max = obj3;
        }

        return max;
    }

    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = 25;
        Integer i3 = 5;

        Integer maxInt = findMax(i1, i2, i3);
        System.out.println("The maximum integer is: " + maxInt);

        Float f1 = 10.5f;
        Float f2 = 25.3f;
        Float f3 = 5.7f;

        Float maxFloat = findMax(f1, f2, f3);
        System.out.println("The maximum float is: " + maxFloat);

        String s1 = "apple";
        String s2 = "banana";
        String s3 = "cherry";

        String maxString = findMax(s1, s2, s3);
        System.out.println("The lexicographically maximum string is: " + maxString);
    }
}
