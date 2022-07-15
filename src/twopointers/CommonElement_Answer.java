package twopointers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Two Pointer 문제는 항상 오름차순 정렬을 하고 시작해야 한다.
 */
public class CommonElement_Answer {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        int n = sc.nextInt();
        int[] nArr = new int[n];
        createArray(nArr);

        int m = sc.nextInt();
        int[] mArr = new int[m];
        createArray(mArr);


        List<Integer> list = new ArrayList<>();

        Arrays.sort(nArr);
        Arrays.sort(mArr);

        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (nArr[p1] == mArr[p1]) {
                list.add(nArr[p1]);
                p1++;
                p2++;
            } else if (nArr[p1] < mArr[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        print(list);


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
