package twopointers;

import java.util.Scanner;

public class ConsecutiveNumbersHap_AnswerWIthMath {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        int[] arr = new int[n];


        int cnt = 0;
        int idx = 1;

        // 15가 여기서 하나 빠져서 14
        n--;

        while (n > 0) {
            // 인덱스가 1 증가해서 2가
            idx++;

            // n = 14,  idx = 2;   n에서 1, 2를 뺀것과 같음
            n = n - idx;


            if (n % idx == 0) cnt++;
        }

        System.out.println("cnt = " + cnt);

 
    }

    private static void createArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
    }
}
