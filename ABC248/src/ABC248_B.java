import java.util.*;

public class ABC248_B {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0 ; i <= 9 ; i++) {
            if (!s.contains(String.valueOf(i))) {
                System.out.println(i);
                return;
            }
        }
        
    }
}
