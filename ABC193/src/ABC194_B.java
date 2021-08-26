import java.util.Scanner;

public class ABC194_B {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int ai = 0;
        int bi = 0;
        int amin = 10000000;
        int bmin = 10000000;
        int sum = 100000000;
        
        for (int i = 0 ; i < n ; i++) {
            if (a[i] < amin) {
                amin = a[i];
                ai = i;
            }
            if (b[i] < bmin) {
                bmin = b[i];
                bi = i;
            }
            sum = Math.min(sum, a[i]+ b[i]);
        }
        int bcan = 10000000;
        int acan = 10000000;
        for (int i = 0 ; i < n ; i++) {
            if (i != ai) {
                bcan = Math.min(bcan, b[i]);
            }
            if (i != bi) {
                acan = Math.min(acan, a[i]);
            } 
        }
        System.out.println(Math.min(sum, Math.min(Math.max(acan, bmin), Math.max(bcan, amin))));
        
    }
}
