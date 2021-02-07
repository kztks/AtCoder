import java.util.Scanner;

public class ABC190_B {
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0 ; i < n ; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        boolean flg = false;
        for (int i = 0 ; i < n ; i++) {
            if (x[i] < s && y[i] > d) {
                flg = true;
            }
        }
        System.out.println(flg ? "Yes" : "No");
    }
}
