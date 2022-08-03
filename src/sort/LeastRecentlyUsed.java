package sort;

import java.util.Scanner;
import java.util.Stack;

public class LeastRecentlyUsed {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int n = sc.nextInt();

        int[] cache = new int[size];
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();




        for (int i = 0; i < n; i++) {

            if (i == 0) {
                cache[0] = arr[i];
            } else {

                boolean exist = false;

                for (int j = 0; j < cache.length; j++) {
                    if (arr[i] == cache[j]) {
                        exist = true;
                        break;
                    }
                }

                if (!exist) {
                    for (int j = size-1; j > 0; j--) {
                        int tmp = cache[j];
                        cache[j] = cache[j-1];
                        cache[j-1] = tmp;
                    }
                    cache[0] = arr[i];
                } else {
                    for (int j = size-1; j > 0; j--) {
                        if (cache[j] == arr[i]) {
                            int tmp = cache[j];
                            cache[j] = cache[j-1];
                            cache[j-1] = tmp;
                        }
                    }
                }

            }

        }

        for (int i : cache) {
            System.out.print(i + " ");
        }


    }



}
