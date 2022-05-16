package ABC244.C;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 42) {
            System.out.println("AGC0" + (n + 1));
            return;
        }
        if (n / 10 >= 1) {
            System.out.println("AGC0" + n);
        } else {
            System.out.println("AGC00" + n);
        }
        
    }
}
