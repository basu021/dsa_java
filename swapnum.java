import java.util.*;

public class swapnum {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter two numbers:- ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        System.out.println("Before swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

}
}