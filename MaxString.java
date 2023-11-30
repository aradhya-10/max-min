import java.util.Scanner;

public class MaxString {
    public static String findMax(String str1, String str2, String str3) {
        String max = str1;

        if (str2.compareTo(max) > 0) {
            max = str2;
        }

        if (str3.compareTo(max) > 0) {
            max = str3;
        }

        return max;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three Strings");

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

		sc.close();

        String max = findMax(s1, s2, s3);
        System.out.println("The lexicographically maximum string is: " + max);
    }
}
