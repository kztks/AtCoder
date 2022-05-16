import java.util.*;
public class ABC247_C {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = func1(n);
        for (int i = 0 ; i < list.size() ; i++) {
            System.out.print(list.get(i));
            if (i == list.size() - 1) {
                System.out.print("\n");
            } else {
                System.out.print(" ");
            }

        }


    }

    static List<Integer> func1 (int n) {
        List<Integer> list = new ArrayList<>();
        if (n == 1) {
            list.add(1);
        } else {
            list.addAll(func1(n - 1));
            list.add(n);
            list.addAll(func1(n - 1));
        }
        return list;

    }
}
