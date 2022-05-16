import java.util.*;

public class ABC240_B {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            set.add(a[i]);
        }
        System.out.println(set.size());
        
    }
}
