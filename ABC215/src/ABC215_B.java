import java.util.Scanner;

public class ABC215_B {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int c = 0;
        while (n > 0) {
            n /= 2;
            c++;
        }
        System.out.println(c - 1);
        
    }
}
