import java.util.Scanner;

public class ABC190_C {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        for (int i = 0 ; i < m ; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
        }
        int k = sc.nextInt();
        int[] c = new int[k];
        int[] d = new int[k];
        for (int i = 0 ; i < k ; i++) {
            c[i] = sc.nextInt() - 1;
            d[i] = sc.nextInt() - 1;
        }
        int max = 0;
        for (int i = 0 ; i < Math.pow(2, k) ; i++) {
            int x = i;
            int[] s = new int[k];
            int[] t = new int[n];
            for (int j = 0 ; j < k ; j++) {
                s[j] = x % 2;
                x /= 2;
            }
            for (int j = 0 ; j < k ; j++) {
                if (s[j] == 0) {
                    t[c[j]]++;
                } else {
                    t[d[j]]++;
                }
            }
            int cnt = 0;
            for (int j = 0 ; j < m ; j++) {
                if (t[a[j]] > 0 && t[b[j]] > 0) cnt++;
            }
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
}
