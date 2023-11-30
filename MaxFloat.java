import java.util.Scanner;
public class MaxFloat {
    public static Float findMax(Float num1, Float num2, Float num3) {
        Float max = num1;

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
		System.out.println("Enter the three Floats");
		
		Float f1 = sc.nextFloat();
		Float f2 = sc.nextFloat();
		Float f3 = sc.nextFloat();
		sc.close();

        Float max = findMax(f1, f2, f3);
        System.out.println("The maximum floating point number is: " + max);
    }
}
