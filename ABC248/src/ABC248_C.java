import java.util.*;

public class ABC248_C {
    private static final long mod = 998244353;

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        long sum = 0;
        long[][] dp = new long[n + 1][k + 1];
        dp[0][0] = 1;
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < k ; j++) {
                for (int l = 1 ; l <= m ; l++) {
                    if (j + l <= k) {
                        dp[i + 1][j + l] += (dp[i][j] + mod) % mod;
                    }
                }
            }
        } 
        for (int i = 1 ; i <= k ; i++) {
            sum +=  (dp[n][i] + mod) % mod;
        }

        System.out.println(sum % mod);
        
    }
}
