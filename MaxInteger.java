import java.util.Scanner;

public class MaxInteger {
    public static Integer findMax(Integer num1, Integer num2, Integer num3) {
        Integer max = num1;

        if (num2.compareTo(max) > 0) {
            max = num2;
        }

        if (num3.compareTo(max) > 0) {
            max = num3;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three Integers");
		
		Integer i1 = sc.nextInt();
		Integer i2 = sc.nextInt();
		Integer i3 = sc.nextInt();
		sc.close();

        Integer max = findMax(i1, i2, i3);
        System.out.println("The maximum number is: " + max);
    }
}
