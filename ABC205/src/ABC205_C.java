import java.util.Scanner;

public class ABC205_C {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (c % 2 == 0) {
            if (Math.abs(a) > Math.abs(b)) {
                System.out.println(">");
            } else if (Math.abs(a) < Math.abs(b)) {
                System.out.println("<");
            } else {
                System.out.println("=");
            }
            return;
        } else {
            if (a > b) {
                System.out.println(">");
            } else if (a < b) {
                System.out.println("<");
            } else {
                System.out.println("=");
            }
        }
        
        
    }

}
