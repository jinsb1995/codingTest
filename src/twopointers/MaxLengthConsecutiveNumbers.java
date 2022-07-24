package twopointers;

import java.util.Scanner;


/**
 * 투 포인터스 알고리즘
 */
public class MaxLengthConsecutiveNumbers {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int lt = 0;
        int maxLength = 0;
        int kCnt = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) kCnt++;

            while (kCnt > k) {
                if (arr[lt] == 0) kCnt--;
                lt++;
            }


            maxLength = Math.max(maxLength, i - lt + 1);

        }

        System.out.println(maxLength);

    }
}
