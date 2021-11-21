import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class take_input {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Enter a int: ");
        int a = sc.nextInt();
        System.out.println("You entered " + a);
        System.out.println("Enter a double: ");
        double b = sc.nextDouble();
        System.out.println("You entered " + b);
        System.out.println("Enter a float: ");
        float c = sc.nextFloat();
        System.out.println("You entered " + c);
        System.out.println("Enter a long: ");
        long d = sc.nextLong();
        System.out.println("You entered " + d);
        sc.close();

    }
}