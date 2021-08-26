import java.util.Scanner;

public class ABC192_A {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println((100 - x % 100));

        
    }
}
