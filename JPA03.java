import java.util.Scanner;

public class JPA03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Input an integer:");
            int num = scanner.nextInt();

            if (num % 2 != 0) {
                System.out.println("The number is odd.");
            } else {
                System.out.println("The number is even.");
            }
        }
        scanner.close();
    }
}