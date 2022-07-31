package stack;

import java.util.Scanner;
import java.util.Stack;


/**
 * 크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수를 구하는 프로그램을 작성하세요.
 */
public class CraneFromKAKAO_Answer {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                 arr[i][j] = sc.nextInt();
            }

        }

        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < moves.length; i++) {
            moves[i] = sc.nextInt();
        }


        Stack<Integer> stack = new Stack<>();

        int answer = 0;

        for (int pos : moves) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][pos - 1] != 0) {
                    int tmp = arr[i][pos - 1];
                    arr[i][pos - 1] = 0;
                    if (!stack.isEmpty() && tmp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }


        System.out.println(answer);

    }
}
