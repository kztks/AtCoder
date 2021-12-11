import java.util.Scanner;

public class ABC219_D {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int dp[][][] = new int[n + 1][x + 1][y + 1];
        for (int i = 0 ; i < n + 1 ; i++) {
            for (int j = 0; j < x + 1 ; j++) {
                for (int k = 0 ; k < y + 1 ; k++) {
                    dp[i][j][k] = 1000000;
                }
            }
        }
        dp[0][0][0] = 0;
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j <= x ; j++) {
                for (int k = 0 ; k <= y ; k++) {
                    dp[i + 1][j][k] = 0;
                }
            }
        }


        
    }
}
