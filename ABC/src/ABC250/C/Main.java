package ABC250.C;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] x = new int[q];
        for (int i = 0 ; i < q ; i++) {
            x[i] = sc.nextInt();
        }
        //key = 
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0 ; i < n ; i++) {
            map.put(i + 1, i);
            map2.put(i, i + 1);
        }
        for (int i = 0 ; i < q ; i++) {
            int b1 = x[i];
            int p1 = map.get(x[i]);
            int b2 = 0;
            int p2 = 0;
            if (p1 != n - 1) {
                b2 = map2.get((p1 + 1) % n);
                p2 = (p1 + 1) % n;
            } else {
                b2 = map2.get(n - 2);
                p2 = n - 2;
            }

            map.put(b1, p2);
            map.put(b2, p1);
            map2.put(p1, b2);
            map2.put(p2, b1);
        }
        int[] a = new int[n];
        for (java.util.Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            a[entry.getKey()] = entry.getValue();
        }
        for (int i = 0 ;i < n ; i++) {
            System.out.print(a[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }

        }
        System.out.print("\n");

        
    }
}
