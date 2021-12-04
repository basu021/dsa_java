//create a calculator

import java.util.Scanner;

public class calculator {
    public static void main() {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:- ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.println("Sum = " + c);
        c = a - b;
        System.out.println("Difference = " + c);
        c = a * b;
        System.out.println("Product = " + c);

        if (b == 0) {
            System.out.println("Division by zero is not possible");
        } else { 
            c = a / b;
            System.out.println("Quotient = " + c);
        }
        sc.close();

    }
}
