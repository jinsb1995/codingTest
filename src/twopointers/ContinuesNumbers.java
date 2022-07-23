package twopointers;

import java.util.Scanner;

public class ContinuesNumbers {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int hap = sc.nextInt();

        int[] arr = new int[n];
        createArray(arr);


        int subHap = 0;
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            int p1 = i;
            
            while(true) {
                if (subHap > hap) {
                    break;
                } else if (subHap != hap) {
                    subHap += arr[p1++];
                } else if (subHap == hap) {
                    cnt++;
                }
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
