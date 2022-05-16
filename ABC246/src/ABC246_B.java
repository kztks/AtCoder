import java.util.*;
public class ABC246_B {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double x = (double) a * 1 / Math.sqrt(a * a + b * b);
        double y = (double) b * 1 / Math.sqrt(a * a + b * b);
        System.out.println(x + " " + y);
        
    }
}
