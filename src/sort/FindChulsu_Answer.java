package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindChulsu_Answer {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }


        List<Integer> list = new ArrayList<>();
        int[] subArr = arr.clone();
        Arrays.sort(subArr);

        for (int i = 0; i < n; i++) {
            if (arr[i] != subArr[i]) list.add(i+1);
        }

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

    }
}
