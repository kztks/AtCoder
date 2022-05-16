import java.util.*;

public class ABC248_A {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        int ans = 0;
        while (a < b) {
            a *= k;
            ans++;
        }
        System.out.println(ans);
    }
}
