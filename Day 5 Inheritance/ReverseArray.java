import java.util.Scanner;

public class ReverseArray {

    // Function to print array
    static void printArray(int ans[], int n) {
        System.out.println("Reversed array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println(); // Move to next line after printing array
    }

    // Function to reverse array using an auxiliary array
    static void reverseArray(int arr[], int n) {
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            ans[n - i - 1] = arr[i];
        }
        printArray(ans, n);
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take size input from user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create array and take input elements
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Call reverse function
        reverseArray(arr, n);

        scanner.close();
    }
}
