import java.util.Scanner;

public class JPA01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Please enter score:");

            int score = scanner.nextInt();

            if (score >= 60) {
                System.out.println("You pass");
            }
            System.out.println("End");
        }
        scanner.close();
    }
}