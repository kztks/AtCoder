import java.util.Arrays;
import java.util.Scanner;

public class ABC173_D {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        int[] a = new int[9];
        Arrays.fill(a, k);
        int[] c = new int[9];
        int[] d = new int[9];
        
        for (int i = 0 ; i < 4 ; i++) {
            a[Character.getNumericValue(s[i])-1]--;
            c[Character.getNumericValue(s[i])-1]++;
            a[Character.getNumericValue(t[i])-1]--;
            d[Character.getNumericValue(t[i])-1]++;
        }
        long bunsi = 0;
        for (int i = 1 ; i <= 9 ; i++) {
            for (int j = 1 ; j <= 9 ; j++) {
                if (chokudaiWin(c, d, i, j)) {
                    if (i == j) {
                        bunsi += (long) a[i - 1] * (a[i - 1] - 1);
                    } else {
                        bunsi += (long) a[i - 1] * a[j - 1];
                    }
                }

            }
        }        
        long bunbo = (long) (9 * k - 8) * (9 * k - 9);
        System.out.println((double) bunsi / bunbo);

        
    }

    static boolean chokudaiWin(int[] c, int[] d, int i, int j) {
        int a = 0;
        int b = 0;
        for (int k = 0 ; k < 9 ; k++) {
            if (i == k + 1) {
                a += (k + 1) * Math.pow(10, c[k] + 1);
            } else {
                a += (k + 1) * Math.pow(10, c[k]);
            }
            if (j == k + 1) {
                b += (k + 1) * Math.pow(10, d[k] + 1);
            } else {
                b += (k + 1) * Math.pow(10, d[k]);
            }
        }
        // System.out.println("i: " + i + " j:" + j + " a: " + a + " b: " + b + " " + (a > b ? "a" : "b") );
        return a > b;
    }
}
