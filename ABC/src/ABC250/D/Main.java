package ABC250.D;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        boolean[] a = eratosthenes(1000000);
        int ans = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < 1000000 ; i++) {
            if (a[i]) list.add(i);
        }
        int[] p = new int[list.size()];
        for (int i = 0 ; i < p.length ; i++) {
            p[i] = list.get(i);
        }
        long count = 0;
        for (int i = 0 ; i < p.length ; i++) {
            int ng = -1;
            int ok = p.length;
            while(ok - ng > 1) {
                int mid = (ok + ng) / 2;
                if (func(p[i], p[mid], n)) {
                    ng = mid;
                } else {
                    ok = mid;
                }
            }
            count += Math.max(ok - i - 1, 0);
        }
        System.out.println(count);
 
        
    }

    static boolean func(long a, long b, long n) {
        n /= a;
        n /= b;
        n /= b;
        n /= b;
        return n != 0;
    }

    private static boolean[] eratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 0 ; i <= n ; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2 ; i <= n ; i++) {
            if (!isPrime[i]) {
                continue;
            } else {
                for (int j = i * 2 ; j <= n ; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
         }
}
