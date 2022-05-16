import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("0" + s.substring(0, 3));
        
    }
}
