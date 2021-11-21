public class add_n {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[3]);
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
