package twopointers;

import java.util.Scanner;

public class ContinuesNumbers_Answer {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int hap = sc.nextInt();

        int[] arr = new int[n];
        createArray(arr);

        int cnt = 0;

        int sum = 0;
        int lt = 0;
        for (int rt = 0; rt < arr.length; rt++) {
            sum += arr[rt];

            if (sum == hap) cnt++;

            while (sum >= hap) {
                sum -= arr[lt++];
                if (sum == hap)  cnt++;
            }


        }

        System.out.println("cnt = " + cnt);


    }

    private static void createArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

}
