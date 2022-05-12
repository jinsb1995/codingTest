package inflearn;

import java.util.Scanner;

public class SelectLeader {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] classes = new int[n+1][6];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                classes[i][j] = sc.nextInt();
            }
        }


        int top = Integer.MIN_VALUE;
        int student = 0;
        // i = 학생
        for (int i = 1; i <= n; i++) {
            int count = 0;

            // j = 학생
            for (int j = 1; j <= n; j++) {

                // k = 학년
                for (int k = 1; k <= 5; k++) {
                        if (classes[i][k] == classes[j][k]) {
                            count++;
                            break;
                        }

                }

            }
            if (top < count) {
                top = count;
                student = i;
            }
        }

        System.out.println(student);


    }
}
