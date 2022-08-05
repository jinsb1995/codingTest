package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortCoordinate {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        quickSort(arr, 0, arr.length - 1);

        int p1 = 0, p2 = 0;
        int target = 0;


        while (p1 < arr.length - 1) {

            for (int i = p1; i < arr.length - 1; i++) {

            }
        }


        for (int[] coordinate : arr) {
            for (int i : coordinate) {
                System.out.print(i + " ");
            }
            System.out.println();
        }


    }

    private static void quickSort(int[][] arr, int start, int end) {
        int part2FirstIndex = partition(arr, start, end);

        if (start < part2FirstIndex - 1)
            quickSort(arr, start, part2FirstIndex - 1);

        if (end > part2FirstIndex)
            quickSort(arr, part2FirstIndex, end);
    }

    private static int partition(int[][] arr, int start, int end) {
        int firstPivot = arr[(start+end)/ 2][0];
        int secPivot = arr[(start+end)/ 2][1];

        while(start <= end) {

            while (arr[start][0] < firstPivot) start++;
            while (arr[end][0] > firstPivot) end--;

//            while (arr[start][0] == firstPivot && arr[start][1] < secPivot) start++;
//            while (arr[end][0] == firstPivot && arr[end][1] > secPivot) end--;


            if (start <= end) {
//                if (arr[start][0] == arr[end][0] && arr[start][1] < arr[end][1]) {
////                    System.out.println(arr[start][0] + " " + arr[start][1] + " || " + arr[end][0] + " " + arr[end][1]);
//                    start++;
//                    end--;
//                    continue;
//
//                }
                int[] tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
                start++;
                end--;
            }
        }

        return start;
    }

}
