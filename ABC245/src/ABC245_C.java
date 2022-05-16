import java.util.Scanner;

public class ABC245_C {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0 ; i < n ; i++) {
            b[i] = sc.nextInt();
        }
        int[] dp = new int[n + 1];
        int[] ep = new int[n + 1];
        dp[1] = 1;
        ep[1] = 1;
        for (int i = 2 ; i <= n ; i++) {
            if (dp[i - 1] == 1 && Math.abs(a[i - 1] - a[i - 2]) <= k) dp[i] = 1;
            if (ep[i - 1] == 1 && Math.abs(a[i - 1] - b[i - 2]) <= k) dp[i] = 1;
            if (dp[i - 1] == 1 && Math.abs(b[i - 1] - a[i - 2]) <= k) ep[i] = 1;
            if (ep[i - 1] == 1 && Math.abs(b[i - 1] - b[i - 2]) <= k) ep[i] = 1;
        }
        System.out.println(dp[n] == 1 || ep[n] == 1 ? "Yes" : "No");
    }
}
