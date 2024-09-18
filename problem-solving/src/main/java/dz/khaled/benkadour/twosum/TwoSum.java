package dz.khaled.benkadour.twosum;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Create By ${} on 15/09/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : 15/09/2024
 * @TIME : 14:51
 * @Project_Name : problem-solving
 */
public class TwoSum {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] result = new int[2];
        System.out.println("Enter the size of array : ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements of array : ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the target : \n");
        int target = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= 0; j--) {
                if (arr[i] + arr[j] == target) {
                    result[0] = j;
                    result[1] = i;
                }
            }
        }

        System.out.println(Arrays.toString(Arrays.stream(result).toArray()));


    }


}

