import java.util.Scanner;

public class ABC205_D {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextLong();
        }
        long b[] = new long[n+1];
        b[0] = a[0] - 1;
        for (int i = 0 ; i < n - 1 ; i++) {
            b[i + 1] = a[i + 1] - a[i] - 1;
        }
        b[n] = 1100000000000000000l - a[n-1] - 1;
        for (int i = 0 ; i < n ; i++) {
            b[i + 1] += b[i]; 
        }
        long[] k = new long[q];
        for (int i = 0 ; i < q ; i++) {
            k[i] = sc.nextLong();
        }

 

        for (int i = 0 ; i < q ; i++) {
            int index = binary_search(k[i], b);
            if (index < 0) {
                System.out.println(k[i]);
            } else {
                System.out.println(a[index] + k[i] - b[index]);
            }
        }

        
    }

    static int binary_search(long key, long[] a) {
        int left = -1;
        int right = a.length;

        while (right - left > 1) {
            int mid = left + (right - left)/2;

            if (a[mid] >= key) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return left;

    }

}
