import java.util.Scanner;

public class ABC225_A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        if (s[0] == s[1] && s[1] == s[2]) {
            System.out.println(1);
            return;
        }
        if (s[0] == s[1] || s[1] == s[2] || s[2] == s[0]) {
            System.out.println(3);
            return;
        }
        System.out.println(6);
    }
}
