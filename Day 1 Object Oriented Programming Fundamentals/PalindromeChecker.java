import java.util.Scanner;

public class PalindromeChecker {

    private String text;

    public PalindromeChecker (String text) {
        this.text = text;
    }

    public boolean isPalindrome (String text) {
        char[] back = new char[text.length()];
        for (int i = text.length()-1, j = 0; i >= 0; i--, j++) {
            char ch = text.charAt(i);
            back[j] = ch;
        }
        String reversedText = new String(back);
        return text.equalsIgnoreCase(reversedText);
    }

    public void displayResult () {
        System.out.println("Palindrome Checker: ");
        System.out.println("Input Text: " + text);
        System.out.println("Is Palindrome or not? " + isPalindrome(text));
    }

    public static void main (String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = input.nextLine();
        PalindromeChecker checker = new PalindromeChecker(text);
        checker.displayResult();
    }
 }
