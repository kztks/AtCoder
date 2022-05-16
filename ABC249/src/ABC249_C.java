import java.util.*;

public class ABC249_C {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0 ; i < n ; i++) {
            s[i] = sc.next();
        }
        int ans = 0;
        for (int bit = 0 ; bit < (1 << n) ; bit++) {
            int cnt = 0;
            int[] c = new int[26];
            for (int i = 0 ; i < n ; i++) {
                if ((bit & (1 << i)) > 0) {
                    for (char j = 'a' ; j <= 'z' ; j++) {
                        if (s[i].contains(String.valueOf(j))) {
                            c[j - 'a']++;
                        }
                    }
                }
            }
            for (int i = 0 ; i < 26 ; i++) {
                if (c[i] == k) cnt++;
            }
            ans = Math.max(ans, cnt);
        }
        System.out.println(ans);

    }
}
