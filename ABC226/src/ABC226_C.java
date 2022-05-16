import java.util.*;
public class ABC226_C {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        Set[] set = new Set[n];
        for (int i = 0 ; i < n ; i++) {
            t[i] = sc.nextInt();
            int k = sc.nextInt();
            Set<Integer> s = new HashSet<>();
            for (int j = 0 ; j < k ; j++) {
                s.add(sc.nextInt() - 1);
            }
            set[i] = s;
        }
        


        
    }
}
