import java.util.Scanner;

public class Main {
    public static String DecimalToRoman(int num) {
        // I reverted the order of the arrays items due to two factors:
        // 1. My better understanding, after the interview, on how roman numbers are created.
        //  1.1 According to Wikipedia: "A number containing two or more decimal digits is built
        //      by appending the Roman numeral equivalent for each, from HIGHEST TO LOWEST."
        //         Example : 246 = CC + XL + VI = CCXLVI
        // 2. Based on point (1), makes more sense for efficiency to go from HIGHEST TO LOWEST.
        int[] decimalNumber = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        // Both arrays must have their equivalent value on the same cell position: 1000 = M, 900 = CM, etc.
        String[] romanValues = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < decimalNumber.length; i++) {
            while (num >= decimalNumber[i]) {
                // Append the corresponding roman value.
                roman.append(romanValues[i]);
                //subtracting to get the remain decimal amount.
                num -= decimalNumber[i];
            }
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        String finalRoman;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int decimal = scanner.nextInt();
        scanner.close();
        // Change logic of if-statement, since it was always true with previous.
        if (decimal > 0 && decimal <= 3000) {
            finalRoman = DecimalToRoman(decimal);
            System.out.println(finalRoman);
        }
        // Now, this else is reachable after fixing logic at 'if'.
        else {
            System.out.println("Invalid input");
        }
    }
}
