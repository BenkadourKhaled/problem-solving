package dz.khaled.benkadour.factorial;

import java.util.Scanner;

/**
 * Create By ${} on 22/09/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : 22/09/2024
 * @TIME : 11:48
 * @Project_Name : problem-solving
 */
public class Factorial {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Factorial Trailing Zeroes
        System.out.println("Enter a positive number: ");
        int n = scanner.nextInt();
        int facto = 1;
        if (n == 0 || n == 1) {
            System.out.println("The factorial of " + n + "Is" + facto);
        }else {
            for (int i = 1; i <= n; i++) {
                facto = facto * i;
            }
            System.out.println("The factorial of " + n + ", Is " + facto);
        }
    }
}
