import java.util.*;

public class ABC240_D {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        int[] d = new int[n];
        for (int i = 0 ; i < n ; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            if (s < t) {
                a[i] = s;
                d[i] = t - s;
            } else {
                a[i] = t; 
                d[i] = s - t;
            }
        }
        int sum = 0;
        for (int i = 0 ; i < n ; i++) {
            sum += a[i];
        }
        if (sum > x) {
            System.out.println("No");
            return;
        }

        boolean[][] dp = new boolean[110][10010];
        dp[0][0] = true;
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j <= x - sum ; j++) {
                dp[i + 1][j] |= dp[i][j];
                if (j >= d[i]) dp[i + 1][j] |= dp[i][j - d[i]];
            }
        }
        System.out.println(dp[n][x - sum] ? "Yes" : "No");


        
    }
}
