package sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckDuplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        String answer = "U";

        quickSort(arr, 0, arr.length - 1);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] == arr[i]) {
                answer = "D";
                break;
            }
        }

//        System.out.println(answer);
    }

    private static void quickSort(int[] arr, int start, int end) {
        int part2FirstIndex = partition(arr, start, end);

        if (start < part2FirstIndex - 1) {
            quickSort(arr, start, part2FirstIndex - 1);
        }

        if (end > part2FirstIndex) {
            quickSort(arr, part2FirstIndex, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start+end) / 2];

        if (start <= end) {

            while (arr[start] < pivot) start++;
            while (arr[end] > pivot) end--;   // arr[end]가 pivot보다 크면 계속 뒤에 남겨둬야 하니까 --

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
