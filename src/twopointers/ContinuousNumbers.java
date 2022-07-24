package twopointers;

import java.util.Scanner;

public class ContinuousNumbers {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int hap = sc.nextInt();

        int[] arr = new int[n];
        createArray(arr);


        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            int subHap = 0;

            for (int j = i; j < arr.length; j++) {
                if (subHap < hap) {
                    subHap += arr[j];
                } else {
                    break;
                }

            }
            if (subHap == hap) cnt++;
        }

        System.out.println("cnt = " + cnt);


    }

    private static void createArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

}
