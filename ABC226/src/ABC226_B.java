import java.util.*;

public class ABC226_B {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> set = new HashSet<>();
        for (int i = 0 ; i < n + 1 ; i++) {
            set.add(sc.nextLine());
        }
        System.out.println(set.size() - 1);
    }
}
