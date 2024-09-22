package dz.khaled.benkadour.palindrom.number;
import java.util.Scanner;

import static java.lang.System.*;

/**
 * Create By ${} on 18/09/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : 18/09/2024
 * @TIME : 11:28
 * @Project_Name : problem-solving
 */
public class Palindrome {

    private static final Scanner scanner = new Scanner(in);

    public static void main(String[] args) {

        var part1= new StringBuilder();
        var part2= new StringBuilder();
        out.println("Enter a number: ");
        int n = scanner.nextInt();

        if (n < 0) {
            out.println("The number must be a positive integer");
        }else if (n == 0) {
            out.println("The number is a zero");
        }else if (n > 0) {
            String str = Integer.toString(n);
            if (str.length() == 1) {
                out.println("The number length must be greater than 1");
            }else {
                verifyPalindrome(str, part1, part2);
            }
        }
    }

    private static void verifyPalindrome(String str, StringBuilder part1, StringBuilder part2) {
        if (str.length() >= 2) {
            for (int i = 0; i <= (str.length() - 1) / 2; i++) {
                part1.append(str.charAt(i));
                part2.append(str.charAt(str.length() - 1 - i));
            }
            if (part1.toString().contentEquals(part2)) {
                out.println("The number you entered is a palindrome");
            }else {
                out.println("The number you entered is NOT a palindrome");
            }
        }
    }
}
