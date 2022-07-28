package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * HashMap
 * SlidingWindow
 */
public class TypeOfSalesRevenue {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        createArray(n, arr);

        int[] answer = new int[n-k+1];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        answer[0] = map.size();

        for (int i = k; i < arr.length; i++) {

            // arr의 i-k번째 값을 지운다.
            map.put(arr[i-k], map.get(arr[i-k])-1);

            if (map.get(arr[i-k]) == 0) map.remove(arr[i-k]);

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            answer[i-k+1] = map.size();
        }

        Arrays.stream(answer).forEach(i -> System.out.print(i + " "));

    }

    private static void createArray(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
}