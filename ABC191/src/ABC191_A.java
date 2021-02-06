import java.util.Scanner;

public class ABC191_A {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a > b ? "Yes" : "No");
        
    }
}
