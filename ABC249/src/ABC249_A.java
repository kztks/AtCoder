import java.util.*;

public class ABC249_A {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        int[] c = new int[w + 1];
        for (int i = 0 ; i < n ; i++) {
            if (a[i] <= w) {
                c[a[i]]++;
            }
        }
        for (int i = 0 ; i < n ; i++) {
            for (int j = i+ 1 ; j < n ; j++) {
                if (i != j && a[i] + a[j] <= w) {
                    c[a[i] + a[j]]++;
                }
            }
        }
        for (int i = 0 ; i < n ; i++) {
            for (int j = i + 1 ; j < n ; j++) {
                for (int k = j + 1 ; k < n ; k++) {
                    if (i != j && j != k && a[i] + a[j] + a[k] <= w) {
                        c[a[i] + a[j] + a[k]]++;
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 0 ; i < c.length ; i++) {
            if (c[i] > 0) {
                ans++;
            }
        }
        System.out.println(ans);
        
    }
}
