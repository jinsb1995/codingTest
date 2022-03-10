package day1;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // line
        int m = sc.nextInt();   // count

        for (int i = m; i > 0; i--) {
            for (int j = n; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
