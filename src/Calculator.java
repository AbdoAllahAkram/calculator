/**
 * Created by AbdoAllah Akram on 4/15/2017.
 */

import java.util.Scanner;

public class Calculator {
    /************* Methods***************/

    // Chose The Operator
    private static char operatorType () {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Operator Type (+, -, *, /) " );
        char op = in.next().charAt(0);
        return op;

    }

    // Scan Number
    private static int scanInput () {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();
        return num;
    }

    // Add Number
    private static int add(int n_1, int n_2) {
        int sum = n_1 + n_2 ;
        return sum;
    }

    // Subtract Number
    private static int sub (int a, int b) {
        int sub = a - b;
        return sub;
    }

    // Multiple Number
    private static int multiple (int n_1, int n_2) {
        int mul = n_1 * n_2 ;
        return mul;
    }

    // Division Number
    private static float div (int a, int b) {
        if (a == 0 || b == 0 ) {
            System.out.print ("0 is not valid number");
            return 0;
        }

        float div = a / b;
        return div;
    }

    // Result Show
    private static void resultShow() {
        char op = operatorType();
        int n_1 = scanInput();
        int n_2 = scanInput();
        float result = 0;

        switch(op) {
            case '+': result = add(n_1, n_2); break;
            case '-': result = sub(n_1, n_2); break;
            case '*': result = multiple(n_1, n_2); break;
            case '/': result = div(n_1, n_2); break;
            default : System.out.print("Non Valid Operator");
        }

        System.out.print("Result = " + result);
    }

    public static void main(String[] args) {

        resultShow();

    }
}
