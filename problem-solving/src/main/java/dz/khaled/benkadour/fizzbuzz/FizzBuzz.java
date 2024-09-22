package dz.khaled.benkadour.fizzbuzz;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Create By ${} on 18/09/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : 18/09/2024
 * @TIME : 10:43
 * @Project_Name : problem-solving
 */
public class FizzBuzz {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz " + i);
            }else if (i % 3 == 0) {
                System.out.println("Fizz " + i);
            }else if (i % 5 == 0) {
                System.out.println("Buzz " + i);
            }else {
                System.out.println(i);
            }
        }

    }
}
