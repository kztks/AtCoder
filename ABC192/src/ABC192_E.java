import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class ABC192_E {

    static final long INF = Long.MAX_VALUE;
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt() - 1;
        int y = sc.nextInt() - 1;
        int[] a = new int[m];
        int[] b = new int[m];
        int[] t = new int[m];
        int[] k = new int[m];
        List<Edge>[] list = new ArrayList[n];
        for (int i = 0 ; i < m ; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
            t[i] = sc.nextInt();
            Edge ef = new Edge(a[i], b[i], t[i]);
            Edge et = new Edge(b[i], a[i], t[i]);
            list[a[i]].add(ef);
            list[b[i]].add(et);
            k[i] = sc.nextInt();
        }

        boolean[] used = new boolean[n];
        long[] distance = new long[n];
        Arrays.fill(distance, INF);
        distance[x] = 0;
        


    }
}

class Edge {
    int from;
    int to;
    int w;
    Edge(int from, int to, int w) {
        this.from = from;
        this.to = to;
        this.w = w;
    }
}