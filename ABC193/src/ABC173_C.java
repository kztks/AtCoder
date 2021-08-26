import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ABC173_C {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        Set<Long> set = new HashSet<>();
        for (int i = 2 ; i <= Math.sqrt(n) ; i++) {
            long x = i;
            while (x * i <= n) {
                x *= i;
                set.add(x);
            }

        }
        System.out.println(n - set.size());

        
    }

    static boolean isPrime(long x) {
        for (int i = 2 ; i <= Math.sqrt(x) ; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
