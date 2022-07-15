package twopointers;

import java.util.*;

/**
 * Two Pointer 문제는 항상 오름차순 정렬을 하고 시작해야 한다.
 *
 */
public class CommonElement {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        int n = sc.nextInt();
        int[] nArr = new int[n];
        createArray(nArr);

        int m = sc.nextInt();
        int[] mArr = new int[m];
        createArray(mArr);

        quickSort(nArr, 0, nArr.length - 1);
        quickSort(mArr, 0, nArr.length - 1);


        List<Integer> list = new ArrayList<>();


        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (nArr[p1] < mArr[p2]) p1++;
            else if (nArr[p1] == mArr[p2]) {
                list.add(nArr[p1]);
                p1++;
                p2++;
            } else p2++;
        }



//        print(nArr);
//        print(mArr);
        print(list);


    }

    private static void quickSort(int[] arr, int start, int end) {
        int partition2FirstIdx = partition(arr, start, end);

        if (start < partition2FirstIdx - 1) {
            quickSort(arr, start, partition2FirstIdx - 1);
        }
        if (partition2FirstIdx < end) {
            quickSort(arr, partition2FirstIdx, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        // 중간값을 구한다.
        int pivot = arr[(start+end) / 2];

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


    private static void createArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }


    private static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    private static void print(List<Integer> arr) {
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
