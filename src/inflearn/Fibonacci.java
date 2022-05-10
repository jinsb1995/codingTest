package inflearn;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 재귀
//        for (int i = 1; i <= n; i++) {
//            System.out.println(fibo(i));
//        }
        int a = 1, b = 1, c;
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }

    }

    private static int fibo(int n) {
        if (n <= 1)
            return n;
        else
            return fibo(n-2) + fibo(n-1);
    }
}
