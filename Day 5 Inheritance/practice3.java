import java.util.Scanner;
public class practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = scanner.nextInt();
        System.out.println("Number Pyramid:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        scanner.close();
    }
}
