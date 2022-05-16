import java.util.*;
public class ABC246_C {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0 ; i < n ; i++) {
            if (k >= a[i]/x) {
                k -= a[i]/x;
                a[i] -= a[i]/x * x; 
            } else {
                a[i] -= k * x;
                k = 0;
            }
            
        }
        Arrays.sort(a);
        for (int i = 0 ; i < n ; i++) {
            if (a[n - 1 - i] > 0 && k > 0) {
                a[n - 1 - i] = 0;
                k--;
            }
        }
        long sum = 0;
        for (int i = 0 ; i < n ; i++) {
            sum += (long) a[i];
        }

        System.out.println(sum);
        
    }
}
