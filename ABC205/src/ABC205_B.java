import java.util.Arrays;
import java.util.Scanner;

public class ABC205_B {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0 ; i  < n ; i++) {
            if (a[i] != i + 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
         
        
    }

}
