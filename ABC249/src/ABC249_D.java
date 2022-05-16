import java.util.*;

public class ABC249_D {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n + 1];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            b[a[i]]++;
        }
        long ans = 0;
        for (int i = 1 ; i <= n ; i++) {
            int x = i;
            for (int j = 1 ; j * j <= x ; j++) {
                if (x % j == 0) {
                    int y = j;
                    int z = x / j;
                    if (x == y && x == z) {
                        ans += (long) b[i] * (b[i] - 1) * (b[i] - 2) / 6;
                    } else if (x == y) {
                        ans += (long) b[x] * (b[y] - 1) * b[z] / 2; 
                    } else if (y == z) {
                        ans += (long) b[x] * b[y] * (b[z] - 1) / 2;
                    } else if (z == x) {
                        ans += (long) b[x] * b[y] * (b[z] - 1) / 2;
                    } else {
                        ans += (long) b[x] * b[y] * b[z];
                    }
                }
            }
        }

        
    }
}
