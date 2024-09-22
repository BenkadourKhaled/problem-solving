package dz.khaled.benkadour;

/**
 * Create By ${} on 22/09/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : 22/09/2024
 * @TIME : 10:02
 * @Project_Name : problem-solving
 */
public class Tester {

    public static void main(String[] args) {
        String str = "BENKADOUR KHALED";
        String result = null;
        if (!str.isEmpty()) {
            result = str.substring(0, str.length() - 1);
        }
        System.out.println(result);
    }
}
