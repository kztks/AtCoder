import java.util.*;

public class ABC240_A {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b - a == 1) {
            System.out.println("Yes");
            return;
        }
        if (b == 10 && a == 1) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
        
    }
}
