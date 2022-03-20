package inflearn.array;

import java.util.Scanner;

public class BigNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int[] num = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            num[i] = sc.nextInt();
        }

        String result = solution(cnt, num);
        System.out.println(result);
    }

    static String solution(int cnt, int[] num) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < cnt; i++) {
            if (i == 0) sb.append(num[i] + " ");
            else if (num[i] > num[i-1]) sb.append(num[i] + " ");
        }
        return sb.toString();
    }
}
