package programmers;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class PressKeypad {

    public static void main(String[] args) {

//        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
//        String hand = "right";

        int[] numbers = {1, 3, 4, 6, 7, 9};
        String hand = "right";

        String solution = solution(numbers, hand);

    }


    public static String solution(int[] numbers, String hand) {
        String answer = "";

        // 1. 시작은 *(10), #(12)에서 시작한다.
        // 2. 왼쪽 3개의 숫자 1, 4, 7은 왼쪽 엄지 사용
        // 3. 오른쪽 3, 6, 9는 오른쪽 엄지 사용
        // 4. 가운데 2,5,8,0(11)은 양 손가락중 가까운 손가락이 누른다.
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < numbers.length; i++) {

            int right_hand = 10;
            int left_hand = 12;

            if (numbers[i] == 0) numbers[i] = 11;


            int right_distance = left_hand - numbers[i];
            int left_distance = right_hand - numbers[i];

            int r = Math.abs(right_distance % 3 + right_distance / 3);
            int l = Math.abs(left_distance % 3 + left_distance / 3);

            System.out.println("r = " + r);
//            System.out.println("l = " + l);


        }



        return answer = sb.toString();
    }



}

