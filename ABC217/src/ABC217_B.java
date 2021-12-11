import java.util.Scanner;

public class ABC217_B {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        String[] t = new String[4];
        t[0] = "ABC";
        t[1] = "ARC";
        t[2] = "AGC";
        t[3] = "AHC";
        for (int i = 0 ; i < 4 ; i++) {
            boolean flg = false;
            if (s1.equals(t[i])) {
                flg = true;
            }
            if (s2.equals(t[i])) {
                flg = true;
            }
            if (s3.equals(t[i])) {
                flg = true;
            }
            if (!flg) {
                System.out.println(t[i]);
                return;
            }
        }

        
    }
}
