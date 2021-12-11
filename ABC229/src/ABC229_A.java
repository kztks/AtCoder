import java.util.*;

public class ABC229_A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if (s1.equals(".#") && s2.equals("#.")) {
            System.out.println("No");
            return;
        }
        if (s1.equals("#.") && s2.equals(".#")) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");

    }
}
