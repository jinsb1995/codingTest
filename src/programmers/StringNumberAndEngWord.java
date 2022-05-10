package programmers;

import java.util.Stack;

public class StringNumberAndEngWord {

    public static void main(String[] args) {

        int[] nums = {1,2,7,6,4};
        System.out.println(solution(nums));


    }


    public static int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {

            int result = 0;
            for (int j = i + 1; j < nums.length; j++) {

                for (int k = j + 1; k < nums.length; k++) {

                    int sum = nums[i] + nums[j] + nums[k];
                    result = checkIsPrimeNumber(sum);

                    if (result == 1) {
                        answer++;
                    }
                }
            }

        }

        return answer;
    }

    // 소수는 몫이 1과 자기 자신밖에 없다.
    public static int checkIsPrimeNumber(int num) {

        int count = 0;

        for (int i = 2; i <= num; i++) {

            if (num%i == 0) {
                count++;
            }
        }
        return count;
    }

}
