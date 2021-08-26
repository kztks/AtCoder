import java.util.Scanner;

public class ABC173_A {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println(((a - b) / a )* 100);
        
    }
}
