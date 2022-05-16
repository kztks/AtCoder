package ABC250.A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int ans = 0;
        if (r + 1 <= h) ans++;
        if (r - 1 > 0) ans++;
        if (c + 1 <= w) ans++;
        if (c - 1 > 0) ans++;
        System.out.println(ans);
        
    }
}
