import java.util.Arrays;
import java.util.Scanner;

public class ABC219_C {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char[] t = sc.next().toCharArray();
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0 ; i < n ; i++) {
            s[i] =  sc.next();
        }
        String[] ss = new String[n];
        for (int i = 0 ; i < n ; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0 ; j < s[i].length() ; j++ ) {
                char c = t[s[i].charAt(j) - 'a'];
                sb.append(c);
            }
            ss[i] = sb.toString();
        }

        Arrays.sort(ss);
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < ss[i].length() ; j++) {
                System.out.print(converter(ss[i].charAt(j), t));
            }
            System.out.print("\n");
        }
        
    }

    static char converter(char c, char[] t) {
        for (int i = 0 ; i < t.length ; i++) {
            if (t[i] == c) {
                return (char)('a' + i);
            }
        }
        return c;
    }
}
