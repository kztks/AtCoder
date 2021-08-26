import java.util.Scanner;

public class ABC194_D {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans = 0;
        for (int i = 1 ; i < n ; i++) {
            ans += (double) n / (n - i);
        }
        System.out.println(ans);
        
    }
}
