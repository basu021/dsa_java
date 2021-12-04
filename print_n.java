import java.util.*;

public class print_n {
    public static void main(String[] args) {
        System.out.println("Enter the end value: ");
        Scanner ip = new Scanner(System.in);
        int en = ip.nextInt();
        ip.close();
        for(int i = 0; i<= en; i++) {
            System.out.println(i);
        }

    }
}
