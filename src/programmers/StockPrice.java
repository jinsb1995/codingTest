package programmers;

import java.util.Arrays;

public class StockPrice {


    public static void main(String[] args) {

//        int[] prices = {1,2,3,2,3};
//                     {4,3,1,1,0}

        int[] prices = {11,32,12,24,10};
//                     {3, 1, 1, 1, 0}
        int[] solution = solution(prices);

        System.out.println("Arrays.toString(solution) = " + Arrays.toString(solution));
    }

    static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {

            for (int j = i+1; j < prices.length; j++) {
                answer[i]++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
        }

        return answer;
    }


}



