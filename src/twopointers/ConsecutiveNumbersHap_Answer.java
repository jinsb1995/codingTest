package twopointers;

import java.util.Scanner;

public class ConsecutiveNumbersHap_Answer {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        // 연속된 자연수의 합으로 n이 나오는 경우
        // 그래서 n/2+1값으로 하면 된다. 왜냐 - 7+8은 되는데 8+9는 안되니까

        int cnt = 0;
        int lt = 0;
        int m = n/2+1;
        int sum = 0;

        int[] arr = new int[m];
        createArray(arr);

        for (int i = 0; i < m; i++) {
            sum += arr[i];

            if (sum == n) cnt++;

            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) cnt++;
            }
        }


    }

    private static void createArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
    }
}
