package ABC250.B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0 ; i < n * a ; i++) {
            for (int j = 0 ; j < n * b ; j++) {
                    if ((i / a + j / b) % 2 == 0) {
                        System.out.print(".");
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.print("\n");
            }
        }
    }

