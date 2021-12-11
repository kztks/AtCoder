import java.util.Scanner;

public class ABC219_A {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x < 40) {
            System.out.println(40 - x);
            return;
        }
        if (x < 70) {
            System.out.println(70 - x);
            return;
        }
        if (x < 90) {
            System.out.println(90 - x);
            return;
        } else {
            System.out.println("expert");
        }
        
    }
}
