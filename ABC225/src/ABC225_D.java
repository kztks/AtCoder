import java.util.*;

public class ABC225_D {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        train[] t = new train[n];
        for (int i = 0 ; i < n ; i++) {
            t[i] = new train(i, -1, -1);
        }
        for (int i = 0 ; i < q ; i++) {
            int c = sc.nextInt();
            if (c == 1) {
                int x = sc.nextInt() - 1;
                int y = sc.nextInt() - 1;
                t[x].back = y;
                t[y].front = x;
            }
            if (c == 2) {
                int x = sc.nextInt() - 1;
                int y = sc.nextInt() - 1;
                t[x].back = -1;
                t[y].front = -1;
            }
            if (c == 3) {
                int x = sc.nextInt() - 1;
                while (t[x].front >= 0) {
                    x = t[x].front;
                }
                int count = 1;
                StringBuilder sb = new StringBuilder();
                sb.append(x + 1);
                sb.append(" ");
                while (t[x].back >= 0) {
                    x = t[x].back;
                    count++;
                    sb.append(x + 1);
                    sb.append(" ");
                }
                String s = count + " " + sb.toString();
                System.out.println(s);
            }
        }
        
    }
}

class train {
    int number;
    int front;
    int back;

    train (int number, int front, int back) {
        this.number = number;
        this.front = front;
        this.back = back;
    } 
}


