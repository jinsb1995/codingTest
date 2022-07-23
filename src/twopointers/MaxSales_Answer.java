package twopointers;

import java.util.Scanner;

public class MaxSales_Answer {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int nDay = sc.nextInt();
        int k = sc.nextInt();

        int[] sales = new int[nDay];

        createArray(sales);






    }

    private static void createArray(int[] sales) {
        for (int i = 0; i < sales.length; i++) {
            sales[i] = sc.nextInt();
        }
    }
}
