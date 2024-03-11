import java.util.Scanner;

public class JPA02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Input:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a > b) {
                System.out.println(a + " is larger than " + b);
            } else if (a < b) {
                System.out.println(b + " is larger than " + a);
            } else {
                System.out.println("Both numbers are equal");
            }
        }
        scanner.close();
    }
}