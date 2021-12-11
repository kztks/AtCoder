import java.util.*;

public class ABC225_C {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] b = new int[n][m];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        int s = (b[0][0] - 1) % 7;
        if (s + m > 7) {
            System.out.println("No");
            return;
        }
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                if (b[i][j] != b[0][0] + i * 7 + j) {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");

    }
}
