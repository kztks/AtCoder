import java.util.Scanner;

public class ABC192_D {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char[] x = sc.next().toCharArray();
        long m = sc.nextLong();

        int d = 0;
        for (int i = 0 ; i < x.length; i++) {
            d = Math.max(d, x[i] - '0');
        }

        if (x.length == 1) {
            System.out.println(d > m ? 0 : 1);
            return;
        }



        
    }
}
