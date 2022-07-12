package inflearn.array;

import java.util.Scanner;

public class Mentoring {

    /*

        만약 A학생이 멘토, B가 멘티가 되는 짝이 되었다면,
        A는 B보다 모든 M번의 수학테스트에서 등수가 앞서야 한다.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int studentNum = sc.nextInt();
        int testCnt = sc.nextInt();

        int[][] given = new int[testCnt][studentNum];

        for (int i = 0; i < given.length; i++) {
            for (int j = 0; j < given[i].length; j++) {
                given[i][j] = sc.nextInt();
            }
        }


        int answer = 0;

        // 학생 이름
        for (int i = 1; i <= studentNum; i++) {

            // 학생 이름
            for (int j = 1; j <= studentNum; j++) {
                
                int cnt = 0;
                
                // 시험 횟수
                for (int k = 0; k < testCnt; k++) {
                    
                    int mento = 0;
                    int menti = 0;
                    
                    // 등수
                    for (int z = 0; z < studentNum; z++) {
                        if (given[k][z] == i) mento = z;
                        else if (given[k][z] == j) menti = z;
                    }
                    if (mento < menti) cnt++;
                }
                if (cnt == testCnt) answer++;
            }
        }

        System.out.println("answer = " + answer);


    }
}
