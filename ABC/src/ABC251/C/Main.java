package ABC251.C;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        int[] t = new int[n];
        int ans = 0;
        int max = 0;
        for (int i = 0 ; i < n ; i++) {
            s[i] = sc.next();
            t[i] = sc.nextInt();
        }
        Set<String> set = new HashSet<>(n * 3 / 2);
        //Set<String> set = new HashSet<>();
        for (int i = 0 ; i < n ; i++) {
            if (!set.contains(s[i])) {
                set.add(s[i]);
                if (t[i] > max) {
                    max = t[i];
                    ans = i;
                }
            }
        }
        System.out.println(ans + 1);

    }
}
