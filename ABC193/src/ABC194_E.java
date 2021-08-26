import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ABC194_E {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        int min = 100000000;
        Set<Integer> set = new TreeSet<>();
        int[] b = new int[1500000];

        //初期値突っ込む
        for (int i = 0 ; i < m ; i++) {
            b[a[i]]++;
            set.add(a[i]);
        }
        min = Math.min(min, (int)set.toArray()[0]);

        for (int i = 1 ; i < n - m + 1; i++) {
            b[a[i]]--;
            b[a[i + m - 1]]++;
            set.add(a[i + m - 1]);
            if (b[a[i]] == 0) {
                set.remove(a[i]);
            }
            min = Math.min(min, (int)set.toArray()[0]);
        }

        System.out.println(min);
         
    }
}
