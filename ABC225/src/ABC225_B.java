import java.util.*;

public class ABC225_B {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] tree = new int[n];
        for (int i = 0 ; i < n - 1 ; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for (int i = 0 ; i < n - 1 ; i++) {
            tree[a[i] - 1]++;
            tree[b[i] - 1]++;
        }
        for (int i = 0 ; i < n ; i++) {
            if (tree[i] == n - 1) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");

        
    }
}
