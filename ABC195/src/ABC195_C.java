import java.util.Scanner;

public class ABC195_C {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long aa = 1000000000000000l; 
        long a = 1000000000000000l - 1;
        long bb = 1000000000000l; 
        long b = 1000000000000l - 1;
        long cc = 1000000000l;
        long c = 1000000000l - 1;
        long dd = 1000000;
        long d = 1000000 -1;
        long ee = 1000;
        long ans = 0;
        if (n == aa) {
            ans += 5;
            ans += (a - bb + 1) * 4;
            ans += (b - cc + 1) * 3;
            ans += (c - dd + 1) * 2;
            ans += (d - ee + 1);
            System.out.println(ans); 
        } else if (n >= bb) {
            ans += (n - bb + 1) * 4;
            ans += (b - cc + 1) * 3;
            ans += (c - dd + 1) * 2;
            ans += (d - ee + 1);
            System.out.println(ans); 
        } else if (n >= cc) {
            ans += (n - cc + 1) * 3;
            ans += (c - dd + 1) * 2;
            ans += (d - ee + 1);
            System.out.println(ans); 
        } else if (n >= dd) {
            ans += (n - dd + 1) * 2;
            ans += (d - ee + 1);
            System.out.println(ans); 
        } else if (n >= ee) {
            ans += (n - ee + 1);
            System.out.println(ans);     
        } else {
            System.out.println(ans);
        }
        
    }
}
