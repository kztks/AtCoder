import java.util.Scanner;

public class ABC191_C {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] s = new char[h][w];
        for (int i = 0 ; i < h ; i++) {
            s[i] = sc.next().toCharArray();
        }
        int cnt = 0;
        for (int i = 0 ; i < h - 1 ; i++) {
            for (int j = 0 ; j < w - 1 ; j++) {
                int b = 0;
                for (int x = 0 ; x < 2 ; x++) {
                    for (int y = 0 ; y < 2 ; y++) {
                        if (s[i + x][j + y] == '#') b++;
                    }
                }
                if (b % 2 == 1) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        
    }
}
