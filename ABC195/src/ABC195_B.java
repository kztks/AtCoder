import java.util.Scanner;

public class ABC195_B {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt() * 1000;

        int min = 1000000007;
        
        int max = 0;
        for (int i = 1 ; i <= 1000000; i++) {
            if (a * i <= w && b * i >= w) {
                min = Math.min(min, i);
                max = Math.max(max, i);
            }

        }
        if (min == 1000000007 || max == 0) {
            System.out.println("UNSATISFIABLE");
        } else {
            System.out.println(min + " " + max);
        }



        
    }
}
