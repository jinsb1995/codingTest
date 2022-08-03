package sort;

import java.util.Scanner;

/**
 * 선택 정렬
 *
 * 9 6 7 3 5 - 최솟값 탐색 3
 * 3 6 7 9 5 - 1회전 결과
 *    .
 *    .
 *    .
 *   반복
 */
public class SelectionSort {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int idx = 0;
            for (int j = i; j < n; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;

        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
