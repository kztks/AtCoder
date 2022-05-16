import java.util.*;

public class ABC248_D {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0 ; i <= n ; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            list.get(a[i]).add(i);
        }


        int q = sc.nextInt();
        int[] l = new int[q];
        int[] r = new int[q];
        int[] x = new int[q];
        for (int i = 0 ; i < q ; i++) {
            l[i] = sc.nextInt() - 1;
            r[i] = sc.nextInt() - 1;
            x[i] = sc.nextInt();
        }


        for (int i = 0 ; i < q ; i++) {
            int left = binarySearch(l[i], list.get(x[i]));
            int right = binarySearch(r[i] + 1, list.get(x[i]));

            System.out.println(right - left);
        }
        
    }

    static int binarySearch(int key, List<Integer> list) {
        int ng = -1;
        int ok = list.size();
        while (Math.abs(ok - ng) > 1) {
            int mid = (ok + ng) / 2;
            if (isOk(mid, key, list)) ok = mid;
            else ng = mid;
        }
        return ok;
    }

    static boolean isOk(int index, int key, List<Integer> list) {
        if (list.get(index) >= key) return true;
        else return false;
    }
}
