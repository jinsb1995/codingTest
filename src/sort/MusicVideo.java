package sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 결정 알고리즘
 *
 * 이분 검색을 이용하는 방법
 *
 * lt부터 rt 사이에 문제에서 요구하는 dvd의 최소 용량이 분명히 있다는 확신이 있을 때  [결정 알고리즘]을 적용할 수 있다.
 *
 *
 *
 */
public class MusicVideo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();

        System.out.println(solution(n, m, arr));

    }

    private static int solution(int n, int m, int[] arr) {

        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        return answer;
    }

    // 얘가 리턴한 값이 m보다 작거나 같을 때만 capacity가 dvd 한장의 용량이다.
    private static int count(int[] arr, int capacity) {

        int cnt = 1;  // dvd 장수
        int sum = 0;  // 담아내는 곡들의 수

        for (int x : arr) {
            if (sum + x > capacity) {
                cnt++;
                sum = x;
            } else {
                sum += x;
            }
        }

        return cnt;
    }
}
