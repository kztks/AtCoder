import java.util.Scanner;

public class ABC190_A {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (c == 0) {
            System.out.println(a > b ? "Takahashi" : "Aoki");
        } else {
            System.out.println(a < b ? "Aoki" : "Takahashi");
        }

    }
}
