import java.util.Scanner;

public class ABC194_A {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a + b >= 15 && b >= 8) {
            System.out.println(1);
            return;
        }
        if (a + b >= 10 && b >= 3) {
            System.out.println(2);
            return;
        }
        if (a + b >= 3) {
            System.out.println(3);
            return;
        }
        System.out.println(4);
        
    }
}
