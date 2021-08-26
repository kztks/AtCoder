import java.util.Scanner;

public class ABC192_C {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0 ; i < k ; i++) {
            int[] a = new int[10];
            while (n > 0) {
                a[n % 10]++;
                n /= 10;
            }
            n = g1(a) - g2(a);
        }
        System.out.println(n);
        
    }

    static int g1(int[] a) {
        StringBuilder sb = new StringBuilder();
        for (int i = 9 ; i >= 0 ; i--) {
            for (int j = 0 ; j < a[i] ; j++) {
                sb.append(String.valueOf(i));
            }
        }
        if (sb.toString().equals("")) {
            return 0;
        }
        return Integer.valueOf(sb.toString());
    }

    static int g2(int[] a) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1 ; i < 10 ; i++) {
            for (int j = 0 ; j < a[i] ; j++) {
                sb.append(String.valueOf(i));
            }
        }
        if (sb.toString().equals("")) {
            return 0;
        }
        return Integer.valueOf(sb.toString());
    }
}
