import java.util.*;

public class ABC245_A {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if (a > c) {
            System.out.println("Aoki");
        } else if (a < c) {
            System.out.println("Takahashi");
        } else {
            System.out.println(b > d ? "Aoki" : "Takahashi");
        }
        
    }
}
