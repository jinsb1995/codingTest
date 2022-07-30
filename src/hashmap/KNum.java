package hashmap;

import java.util.*;

public class KNum {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
        }

        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());

//        quickSort(arr, 0, arr.length-1);

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int z = j+1; z < n; z++) {
                    int sum = arr[i] + arr[j] + arr[z];
                    set.add(sum);
                }
            }
        }

        int cnt = 1;
        int answer = 0;
        for (Integer integer : set) {
            if (cnt == k) {
                answer = integer;
                break;
            } else {
                answer = -1;
            }
            cnt++;
        }

        System.out.println(answer);

/*
10 3
13 15 34 23 45 65 33 11 26 42
 */

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
        int pivot = arr[(start+end)/2];

        while (start <= end) {

            while (arr[start] > pivot) start++;
            while (arr[end] < pivot) end--;

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
