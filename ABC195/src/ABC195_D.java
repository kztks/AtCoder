import java.util.Arrays;
import java.util.Scanner;

public class ABC195_D {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        int[] w = new int[n];
        int[] v = new int[n];
        for (int i = 0 ; i < n ; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        int[] x = new int[m];
        for (int i = 0 ; i < m ; i++) {
            x[i] = sc.nextInt();
        }
        int[][] Q = new int[q][2];
        for (int i = 0 ; i < q ; i++) {
            Q[i][0] = sc.nextInt() - 1;
            Q[i][1] = sc.nextInt() - 1;
        }
        for (int i = 0 ; i < q ; i++) {
            int ans = 0;
            int[] b = new int[m];
            for (int j = 0 ; j < m ; j++) {
                b[j] = x[j];
            }
            int[] used = new int[n];
            for (int j = Q[i][0] ; j <= Q[i][1] ; j++) {
                b[j] = 0;
            }
            Arrays.sort(b);
            for (int j = 0; j < m ; j++) {
                int c = -1;
                int d = 0;
                for (int k = 0 ; k < n ; k++) {
                    if (w[k] <= b[j] && used[k] == 0 && v[k] >= d) {
                        d = v[k];
                        c = k;
                    }
                }
                if (c != -1) {
                    ans += d;
                    used[c] = 1;
                }
            }
            System.out.println(ans);

        }


    }
}
