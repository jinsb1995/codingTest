package day1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Crane {
    public static void main(String[] args) {

        /*
            1. move의 위치로 이동해서 데이터를 집어 보관함으로 옮긴다.
            2. 보관함에서 같은 데이터 두개가 연속되면 둘 다 사라진다.
            3. 반환되어야 할 값은 터져서 사라진 인형의 갯수
         */

        int[][] board = {
                             {0, 0, 0, 0, 0}
                            ,{0, 0, 1, 0, 3}
                            ,{0, 2, 5, 0, 1}
                            ,{4, 2, 4, 4, 2}
                            ,{3, 5, 1, 3, 1} };
        int[] moves = {1,5,3,5,1,2,1,4};

        int result = solution(board, moves);
        System.out.println(result);

    }

    static int solution(int[][] board, int[] moves) {

        Stack<Integer> store = new Stack<>();
        int cnt = 0;

        // moves
        for (int move = 0; move < moves.length; move++) {
            // 바깥쪽 배열
            for (int outer = 0; outer < board.length; outer++) {
                if (board[outer][moves[move]-1] != 0) {
                    if (!store.isEmpty() && store.peek() == board[outer][moves[move]-1]) {
                        store.pop();
                        cnt += 2;
                    } else {
                        store.push(board[outer][moves[move]-1]);
                    }
                    board[outer][moves[move]-1] = 0;
                    break;
                }
            }
        }
        return cnt;
    }
}

//        for (int[] ints : board) {
//            for (int anInt : ints) {
//
//                System.out.print(anInt + "  ");
//            }
//            System.out.println();
//        }
