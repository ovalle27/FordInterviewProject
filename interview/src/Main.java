import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String  DecimalToRoman (int  num){
        int [] decimalNumber = {1, 4, 5, 9, 10, 40, 90};
        String[] romanValues = {"I", "IV", "V","IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM"};
        StringBuilder roman = new StringBuilder();
        // 3 = iii
        for(int i = 0 ; i < decimalNumber.length ; i++){
            3 bigger or equal than 1 : yes   (grap I)    I
            3 bigger or equa than 2 : yes   (grab I)    II
            3 bigger or equal than 3 : yes  (grab I)    III

            3 bigger or equal than 4 : no  ...STOP!

        }

     return "";
    }

    public static void main(String[] args) {
        String finalRoman
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int decimal = scanner.nextInt();
        scanner.close();

        if(decimal >= 1 || decimal <= 3000){
            //create

        }
        else{
            System.out.println("Wrong input. Try again");
        }




        }
    }
}