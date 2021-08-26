import java.util.Scanner;

public class ABC202_B {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        for (int i = s.length - 1; i >= 0 ; i--) {
            if (s[i] == '6') {
                s[i] = '9';
            } else if (s[i] == '9') {
                s[i] = '6';
            }
            System.out.print(s[i]);
        }
        
    }
}
