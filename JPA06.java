import java.util.Scanner;

public class JPA06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("Input Chinese score:");
            int num1 = scanner.nextInt();
            System.out.print("Input English score:");
            int num2 = scanner.nextInt();
            System.out.print("Input Math score:");
            int num3 = scanner.nextInt();

            if (num1 < 60) {
                System.out.println("Chinese failed");
            }
            if (num2 < 60) {
                System.out.println("English failed");
            }
            if (num3 < 60) {
                System.out.println("Math failed");
            }
            if (num1 >= 60 && num2 >= 60 && num3 >= 60) {
                System.out.println("All Pass");
            }
        }
        scanner.close();
    }
}