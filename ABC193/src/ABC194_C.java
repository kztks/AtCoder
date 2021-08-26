import java.util.Scanner;

public class ABC194_C {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        long sum = 0;
        for (int i = 0 ; i < n ; i++) {
            sum += a[i];
        }
        long sum2 = 0;
        for (int i = 0 ; i < n ; i++) {
            sum2 += (long) a[i] * a[i];
        }
        System.out.println((long) ((n) * sum2 - sum * sum));

        
    }
}
