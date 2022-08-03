package sort;

import java.util.Scanner;

/**
 * 삽입 정렬
 *
 */
public class InsertionSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 최초 두번째 자리부터 시작한다.
        for (int i = 1; i < n; i++) {

            int idx = i;

            // 두번재 자리와 첫번째 자리를 비교해서 오름차순에 맞게 정렬한다.
            for (int j = i-1; j >= 0; j--) {

                if (arr[idx] < arr[j]) {
                    int tmp = arr[idx];
                    arr[idx] = arr[j];
                    arr[j] = tmp;
                    idx--;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
