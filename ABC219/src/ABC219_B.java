import java.util.Scanner;

public class ABC219_B {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        char[] t = sc.next().toCharArray();
        for (int i = 0 ; i < t.length ; i++) {
            if (t[i] == '1') {
                System.out.print(s1);
            }
            if (t[i] == '2') {
                System.out.print(s2);
            }
            if (t[i] == '3') {
                System.out.print(s3);
            }
        }
        System.out.print("\n");
        
    }
}
