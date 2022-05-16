import java.util.*;

public class ABC247_D {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Deque<ball> queue = new ArrayDeque<>();
        for (int i = 0 ; i < q ; i++) {
            int n = sc.nextInt();
            if (n == 1) {
                int x = sc.nextInt();
                long c = sc.nextLong();
                queue.add(new ball(x, c));
            } else {
                long c = sc.nextLong();
                long sum = 0;
                while (c > 0) {
                    if (c >= queue.peek().count) {
                        sum += queue.peek().count * queue.peek().number;
                        c -= queue.peek().count;
                        queue.poll();
                    } else {
                        long tempC = queue.peek().count;
                        int tempN = queue.peek().number;
                        sum += tempN * c;
                        queue.poll();
                        queue.addFirst(new ball(tempN, tempC - c));
                        c = 0;
                    }
                }
                System.out.println(sum);
            }
        }  
    }
}

class ball {
    int number;
    long count;
    ball(int number, long count) {
        this.number = number;
        this.count = count;
    }
}
