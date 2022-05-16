import java.util.Scanner;

public class ABC246_D {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = Long.MAX_VALUE;
        for (long i = 0 ; i <= 1000000 ; i++) {
            long ng = -1;
            long ok = 1000001;
            while(ok - ng > 1) {
                long mid = (ok + ng) / 2;
                if (func(i, mid) >= n) {
                    ok = mid;
                } else {
                    ng = mid;
                }
            }
            ans = Math.min(ans, func(i, ok));

        }
        System.out.println(ans);
    }


    static long func(long a, long b) {
        return a*a*a + a*a*b + a*b*b + b*b*b;
    }
}
