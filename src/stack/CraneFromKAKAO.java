package stack;

import java.util.Scanner;
import java.util.Stack;


/**
 * 크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수를 구하는 프로그램을 작성하세요.
 */
public class CraneFromKAKAO {

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

        int cnt = 0;
        for (int i = 0; i < moves.length; i++) {
            int loc = moves[i] - 1;

            for (int j = 0; j < n; j++) {
                if (!stack.isEmpty() && stack.peek() == arr[j][loc]) {
                    stack.pop();
                    arr[j][loc] = 0;
                    cnt += 2;
                    break;
                }

                if (arr[j][loc] != 0) {
                    stack.push(arr[j][loc]);
                    arr[j][loc] = 0;
                    break;
                }
            }
        }

        System.out.println(cnt);

    }
}
