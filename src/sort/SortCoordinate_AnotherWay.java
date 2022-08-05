package sort;

import java.util.Arrays;
import java.util.Scanner;

public class SortCoordinate_AnotherWay {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] tmp = new int[n][2];
        mergeSort(arr, tmp, 0, arr.length - 1);


//        for (int[] coordinate : arr) {
//            for (int i : coordinate) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
        for (int[] coordinate : arr) {

            System.out.println(Arrays.toString(coordinate).replaceAll("[\\[\\],]", ""));
        }
    }

    private static void mergeSort(int[][] arr, int[][] tmp, int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;  // 배열의 중간 인덱스를 가져온다.
            mergeSort(arr, tmp, start, mid);
            mergeSort(arr, tmp, mid + 1, end);


            for (int i = start; i <= end; i++) {
                tmp[i] = arr[i];
            }

            int part1StartIdx = start;
            int part2StartIdx = mid + 1;
            int index = start;

            while (part1StartIdx <= mid && part2StartIdx <= end) {
                if (tmp[part1StartIdx][0] <= tmp[part2StartIdx][0]) {
                    if (tmp[part1StartIdx][0] == tmp[part2StartIdx][0] && tmp[part1StartIdx][1] > tmp[part2StartIdx][1]) {
                        arr[index] = tmp[part2StartIdx];
                        part2StartIdx++;
                    } else {
                        arr[index] = tmp[part1StartIdx];
                        part1StartIdx++;
                    }
                } else {
                    if (tmp[part1StartIdx][0] == tmp[part2StartIdx][0] && tmp[part1StartIdx][1] < tmp[part2StartIdx][1]) {
                        arr[index] = tmp[part1StartIdx];
                        part1StartIdx++;
                    } else {
                        arr[index] = tmp[part2StartIdx];
                        part2StartIdx++;
                    }
                }
                index++;
            }
            for (int i = 0; i <= mid - part1StartIdx; i++) {
                arr[index + i] = tmp[part1StartIdx + i];
            }
        }

    }

//    private static void merge(int[][] arr, int[][] tmp, int start, int mid, int end) {
//
//    }


}
