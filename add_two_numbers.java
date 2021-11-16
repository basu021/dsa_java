import java.util.Scanner;

public class add_two_numbers {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        c = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + c);

    }
}
