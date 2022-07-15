package twopointers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoArrayMerge_Answer {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int first = sc.nextInt();
        int[] firstArr = new int[first];
        createArrElement(firstArr);

        int sec = sc.nextInt();
        int[] secArr = new int[sec];
        createArrElement(secArr);


        // 퀵 정렬(n Log n)

        List<Integer> answer = new ArrayList<>();

        int p1 = 0, p2 = 0;

        while (p1 < first && p2 < sec) {
            if (firstArr[p1] < secArr[p2]) answer.add(firstArr[p1++]);
            else answer.add(secArr[p2++]);
        }
        while (p1 < first) answer.add(firstArr[p1++]);
        while (p2 < sec) answer.add(secArr[p2++]);

        print(answer);

    }

    private static void createArrElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    private static void print(List<Integer> arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }


}
