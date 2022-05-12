package inflearn;

import java.util.Scanner;

public class CalculateScore {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] scores = new int[n];

        int count = 0;
        int score = 0;

        for (int i = 0; i < n; i++) scores[i] = sc.nextInt();

        for (int i = 0; i < scores.length; i++) {

            if (scores[i] == 0) score = 0;

            if (i > 0 && scores[i] == 1 && scores[i] == scores[i-1]) {
                score++;
            } else if (i > 0 && scores[i] == 1) {
                score = 1;
            }

            if (i == 0 && scores[i] == 1) {
                score++;
            }


            count += score;
        }

        System.out.println("count = " + count);
    }
}
