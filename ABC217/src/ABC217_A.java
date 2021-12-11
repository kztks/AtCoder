import java.util.Scanner;

public class ABC217_A {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(s.compareTo(t) < 0 ? "Yes" : "No");

    }
}
