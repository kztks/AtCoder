import java.util.Scanner;

public class ABC245_B {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[2001];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            b[a[i]]++;
        }
        for (int i = 0 ; i <= 2000 ; i++) {
            if (b[i] == 0) {
                System.out.println(i);
                return;
            }
        }
        
    }
}
