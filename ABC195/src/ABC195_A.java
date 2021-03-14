import java.util.Scanner;

public class ABC195_A {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int h = sc.nextInt();
        System.out.println(h % m == 0 ? "Yes" : "No");

        
    }
}
