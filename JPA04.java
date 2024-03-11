import java.util.Scanner;

public class JPA04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Input:");
            int num = scanner.nextInt();

            if (num % 9 == 0 && num % 5 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        scanner.close();
    }
}