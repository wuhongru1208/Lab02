import java.util.Scanner;

public class JPA07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("請輸入三個整數:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a + b > c && b + c > a && c + a > b) {
                if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b) {
                    System.out.println("直角三角形");
                } else if (a * a + b * b < c * c || b * b + c * c < a * a || c * c + a * a < b * b) {
                    System.out.println("鈍角三角形");
                } else {
                    System.out.println("銳角三角形");
                }
            } else {
                System.out.println("不可構成三角形");
            }
        }
        scanner.close();
    }
}