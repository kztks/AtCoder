import java.util.*;

public class ABC247_B {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        String[] t = new String[n];
        for (int i = 0 ; i < n ; i++) {
            s[i] = sc.next();
            t[i] = sc.next();
        }
        for (int i = 0 ; i < n ; i++) {
            boolean flg1 = false;
            boolean flg2 = false;
            for (int j = 0 ; j < n ; j++) {
                if (i != j) {
                    flg1 |= s[i].equals(s[j]);
                    flg1 |= s[i].equals(t[j]);
                    flg2 |= t[i].equals(t[j]);
                    flg2 |= t[i].equals(s[j]);
                }
            }
            if (flg1 && flg2) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        
    }
}
