import java.util.Scanner;

public class ABC217_C {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0 ; i < n ; i++) {
            p[i] = sc.nextInt();
        }
        int [] q = new int[n];
        for (int i = 0 ; i < n ; i++) {
            q[p[i] - 1] = i + 1; 
        }
        for (int i = 0 ; i < n - 1 ; i++) {
            System.out.print(q[i]);
            System.out.print(" ");
        }
        System.out.println(q[n - 1]);
        
    }
}
