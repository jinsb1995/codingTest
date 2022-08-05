package sort;

import java.util.Arrays;
import java.util.Scanner;

public class FindChulsu {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] subArr = new int[n];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
            subArr[i] = num;
        }


        StringBuilder sb = new StringBuilder();

        quickSort(subArr, 0, subArr.length - 1);

        for (int i = 0; i < n; i++) {

            if (arr[i] != subArr[i]) sb.append(i + 1).append(" ");

        }


        System.out.println(sb.toString());


    }

    private static void quickSort(int[] arr, int start, int end) {
        int part2FirstIndex = partition(arr, start, end);

        if (start < part2FirstIndex - 1)
            quickSort(arr, start, part2FirstIndex - 1);

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
