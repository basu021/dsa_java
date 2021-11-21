import java.util.*;

public class prime {
    public static void main(String[] args) {
        System.out.println("Enter a number to check:- ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        for(int i = 2; i*i <= a; ++i) {
            if(a % i == 0) {
                System.out.println("The number is not prime");
                return;
            }
        }
        System.out.println("The number is prime");
    }
}
