import java.util.*;

public class ABC240_C {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int c = 0;

        Deque<pair> queue = new ArrayDeque<pair>();

        for (int i = 0 ; i < n ; i++) {
            if (queue.size() == 0) {
                queue.add(new pair(a[i], 1));
                c++;
            } else {
                if (queue.peekLast().s == a[i]) {
                    int count = queue.peekLast().t + 1;
                    queue.pollLast();
                    queue.add(new pair(a[i], count));
                    c++;
                } else {
                    queue.add(new pair(a[i], 1));
                    c++;
                }
            }
            if (queue.size() > 0 && queue.peekLast().t == a[i]) {
                queue.pollLast();
                c -= a[i];
            }
            System.out.println(c);
        }
    }

}

class pair {
    int s;
    int t;

    pair(int s, int t) {
        this.s = s;
        this.t = t;
    }
}
