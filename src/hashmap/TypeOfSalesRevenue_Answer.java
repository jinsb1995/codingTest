package hashmap;

import java.util.*;

/**
 * HashMap
 * SlidingWindow
 */
public class TypeOfSalesRevenue_Answer {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        createArray(n, arr);


        List<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();

        for (int i = 0; i < k-1; i++) {
            HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        for (int rt = k-1; rt < n; rt++) {
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) + 1);

            answer.add(HM.size());
            HM.put(arr[lt], HM.get(arr[lt])-1);
            if (HM.get(arr[lt]) == 0) HM.remove(arr[lt]);
            lt++;
        }

        answer.forEach(System.out::println);




    }

    private static void createArray(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
/*

        int[] answerArr = new int[n-k+1];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        answerArr[0] = map.size();


        for (int i = k; i < arr.length; i++) {

            map.put(arr[i-k], map.get(arr[i-k])-1);
            if (map.get(arr[i-k]) == 0) map.remove(arr[i-k]);  // 키의 값이 0 이면 키를 지운다.

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            answerArr[i-k+1] = map.size();
        }

        Arrays.stream(answerArr).forEach((size) -> System.out.print(size + " "));


 */