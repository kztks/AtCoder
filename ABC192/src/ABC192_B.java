import java.util.Scanner;

public class ABC192_B {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        for (int i = 0 ; i < s.length ; i++) {
            if (i % 2 == 0) {
                if (s[i] - 'a' < 0) {
                    System.out.println("No");
                    return;
                }
            } else {
                if (s[i] - 'a' >= 0) {
                    System.out.println("No");
                    return;
                }
                
            }
        }
        System.out.println("Yes");
        
    }
}
