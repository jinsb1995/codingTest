package twopointers;

import java.util.Scanner;

public class ConsecutiveNumbersHap {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        int[] arr = new int[n];
        createArray(arr);


        // 연속된 자연수의 합으로 n이 나오는 경우
        // 그래서 n/2+1값으로 하면 된다. 왜냐 - 7+8은 되는데 8+9는 안되니까
        int cnt = 0;
        int lt = 0, rt = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i != n - 1) {
                sum += arr[i];

                if (sum == n) cnt++;

                while (sum >= n) {
                    sum -= arr[lt++];
                    if (sum == n) cnt++;
                }
            }
        }

        System.out.println("cnt = " + cnt);




    }

    private static void createArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
    }
}
