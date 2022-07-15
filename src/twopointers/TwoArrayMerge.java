package twopointers;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Two Pointer 문제는 항상 오름차순 정렬을 하고 시작해야 한다.
 */
public class TwoArrayMerge {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int first = sc.nextInt();
        int[] firstArr = new int[first];
        createArrElement(firstArr);

        int sec = sc.nextInt();
        int[] secArr = new int[sec];
        createArrElement(secArr);



        int[] answer = new int[first + sec];
        for (int i = 0, j = 0; i < answer.length; i++) {
            if (i < first)
                answer[i] = firstArr[i];
            else {
                answer[i] = secArr[j];
                j++;
            }
        }


        quickSort(answer, 0, answer.length - 1);
        print(answer);


    }

    private static void quickSort(int[] arr, int start, int end) {

        int partition2StartIdx = partition(arr, start, end);


        if (start < partition2StartIdx - 1) {
            quickSort(arr, start, partition2StartIdx - 1);
        }
        if (partition2StartIdx < end) {
            quickSort(arr, partition2StartIdx, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        // 중간 값을 가져온다. 소수점은 버림
        int pivot = arr[(start + end) / 2];

        // 마지막 자리가 앞자리를 역전할 때 까지
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

    private static void createArrElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    private static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }


}
