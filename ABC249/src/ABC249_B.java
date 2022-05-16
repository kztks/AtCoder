import java.util.*;

public class ABC249_B {
    private static final String NO = "No";

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] a = new char[26];
        char[] b = new char[26];
        for (int i = 0 ; i < s.length ; i++) {
            if (s[i] - 'a' >= 0) {
                a[s[i] - 'a']++;
            } else {
                b[s[i] - 'A']++;
            } 
        }
        int l = 0;
        int u = 0;
        for (int i = 0 ; i < 26 ; i++) {
            if (a[i] > 1 || b[i] > 1) {
                System.out.println(NO);
                return;
            }
            if (a[i] == 1) l++;
            if (b[i] == 1) u++;
        }
        System.out.println(u > 0 && l > 0 ? "Yes" : "No");
    }
}
