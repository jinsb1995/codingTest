package twopointers;

import java.util.Scanner;

/**
 * 슬라이딩 윈도우 문제
 */
public class MaxSales {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int nDay = sc.nextInt();
        int k = sc.nextInt();

        int[] sales = new int[nDay];


        createArray(sales);
        sc.close();

        int answer = 0;
        int subMax = 0;
        for (int i = 0; i < k; i++) {
            subMax += sales[i];
        }

        answer = subMax;
        for (int i = k; i < nDay; i++) {


            subMax +=(sales[i] - sales[i-k]);

            if (answer < subMax) {
                answer = subMax;
            }
        }

        System.out.println(answer);


    }

    private static void createArray(int[] sales) {
        for (int i = 0; i < sales.length; i++) {
            sales[i] = sc.nextInt();
        }
    }


}
