package dz.khaled.benkadour.fact.zeroes.trailing;

import java.util.Scanner;

/**
 * Create By ${} on 24/09/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : 24/09/2024
 * @TIME : 10:09
 * @Project_Name : problem-solving
 */
public class FactorialTrailingZeroes {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number to calculate the factorial trailing zeroes : ");
        int n = scanner.nextInt();
        String factStr = CalculFactAndConvertedToString(n);
        int co = 0;
        for (int i = 0; i < factStr.length(); i++) {
            if (factStr.charAt(i) == '0') {
                co ++;
            }
        }

        System.out.println("The number of occurrence of Zeroes Is : " + co);

    }

    private static String CalculFactAndConvertedToString(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        String factStr = Integer.toString(fact);
        return factStr;
    }

}
