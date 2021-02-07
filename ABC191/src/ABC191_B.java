import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ABC191_B {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int x = sc.nextInt();
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < n ; i++) {
            if (a[i] != x) {
                list.add(a[i]);
            }
        }
        for (int i = 0 ; i < list.size(); i++) {
            if (i < list.size() - 1) {
                System.out.print(list.get(i));
                System.out.print(" ");
            } else {
                System.out.print(list.get(i));
                System.out.print("\n");
            }
        }
    }
}
