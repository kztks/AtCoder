import java.util.Scanner;

public class ABC195_E {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        char[] x = sc.next().toCharArray();
        int mod = 0;
        for (int i = 0 ; i < n; i++) {
            int num = s[i] - '0';
            if (x[i] == 'A') {
                if (mod == 0 && num != 7) {
                    mod += num % 7;
                    mod %= 7;
                }
            } else {
                if ((mod * 10 + num) % 7 == 0) {
                    mod = 0;
                }
            }

        }
        System.out.println(mod == 0 ? "Takahashi" : "Aoki");
        
    }
}
