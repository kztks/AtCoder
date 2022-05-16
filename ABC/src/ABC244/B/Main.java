package ABC244.B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int x = 0;
        int y = 0;
        int[] dx = {1, 0 , -1 , 0};
        int[] dy = {0, -1, 0, 1 };
        int index = 0;
        for (int i = 0 ; i < n ; i++) {
            if (s[i] == 'S') {
                x += dx[index];
                y += dy[index];
            } else {
                index++;
                index %= 4;
            }
        }
        System.out.println(x + " " + y);
        
    }
}
