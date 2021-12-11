import java.util.Scanner;

public class ABC215_A {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.equals("Hello,World!") ? "AC" : "WA");
        
    }
}
