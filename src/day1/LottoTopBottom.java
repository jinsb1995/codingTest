package day1;

public class LottoTopBottom {
    public static void main(String[] args) {
        int[] lotto   = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        solution(lotto, win_nums);
    }

    private static int[] solution(int[] lotto, int[] win_nums) {
        int cnt = 0;
        for (int i : lotto)
            if (i == 0) cnt++;

        int[] answer = new int[cnt];

        int rank = 6;
        int match = 0;

        for (int i = 0; i < lotto.length; i++) {

        }






        return answer;
    }
}
