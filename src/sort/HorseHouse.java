package sort;

import java.util.Arrays;
import java.util.Scanner;

public class HorseHouse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] tmp = new int[n];
        mergeSort(arr, tmp, 0, arr.length - 1);

//        System.out.println(Arrays.toString(arr));


        int lt = 1;
        int rt = arr[n-1];
        int answer = 0;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (count(arr, mid) >= m) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        System.out.println(answer);
    }

    private static int count(int[] arr, int dist) {

        int cnt = 1;
        int ep = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }

        return cnt;
    }

    private static void mergeSort(int[] arr, int[] tmp, int start, int end) {

        if (start < end) {

            int mid = (start + end) / 2;

            mergeSort(arr, tmp, start, mid);
            mergeSort(arr, tmp, mid + 1, end);

            for (int i = start; i <= end; i++) {
                tmp[i] = arr[i];
            }

            int part1 = start;
            int part2 = mid + 1;
            int index = start;

            while (part1 <= mid && part2 <= end) {

                if (tmp[part1] <= tmp[part2]) {
                    arr[index] = tmp[part1];
                    part1++;
                } else {
                    arr[index] = tmp[part2];
                    part2++;
                }
                index++;
            }

            for (int i = 0; i < mid - part1; i++) {
                arr[index + i] = tmp[part1 + i];
            }
        }
    }


}
