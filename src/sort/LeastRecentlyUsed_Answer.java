package sort;

import java.util.Scanner;

public class LeastRecentlyUsed_Answer {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int n = sc.nextInt();

        int[] cache = new int[size];
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();


        for (int x : arr) {
            int pos = -1;

            // 만약 if문을 통과한다면 cache hit이다.
            for (int i = 0; i < size; i++) if (x == cache[i]) pos=i;

            if (pos == -1) {
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i-1];
                }
                cache[0] = x;
            } else {
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i-1];
                }
                cache[0] = x;
            }
        }

        for (int i : cache) {
            System.out.print(i + " ");
        }


    }



}
