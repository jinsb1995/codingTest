package sort;

import java.util.Scanner;

/**
 * BinarySearch 이분 검색
 *
 * 이분검색은 꼭!!!! 정렬이 되어있어야 한다.
 *
 * 앞에서부터 하나하나 찾아가는건 [순차 검색]
 *
 *
 */
public class BinarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, arr.length - 1);

        int lt = 0, rt = arr.length - 1, mid = 0;
        int answer = 0;

        while (arr[mid] != m) {
            mid = (lt + rt) / 2;

            if (arr[mid] == m) {
                answer = mid + 1;
            } else if (arr[mid] > m) {
                rt = mid - 1;
            } else if (arr[mid] < m) {
                lt = mid + 1;
            }
        }


        System.out.println(answer);

    }

    private static void quickSort(int[] arr, int start, int end) {
        int part2FirstIndex = partition(arr, start, end);

        if (start < part2FirstIndex - 1)
            quickSort(arr, start, part2FirstIndex -1);

        if (end > part2FirstIndex)
            quickSort(arr, part2FirstIndex, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];

        while (start <= end) {

            while (arr[start] < pivot) start++;
            while (arr[end] > pivot) end--;

            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }

        return start;
    }

    private static void swap(int[] arr, int start, int end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }
}
