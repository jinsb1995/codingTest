package inflearn;

import java.util.Scanner;

public class MaxHap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] pan = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pan[i][j] = sc.nextInt();
            }
        }


        int hap1, hap2;

        int max = 0;

        for (int i = 0; i < pan.length; i++) {
            hap1 = hap2 = 0;
            for (int j = 0; j < pan.length; j++) {
                hap1 += pan[i][j];
                hap2 += pan[j][i];
            }
            max = Math.max(max, hap1);
            max = Math.max(max, hap2);
        }


        hap1 = hap2 = 0;
        for (int i = 0; i < pan.length; i++) {
            hap1 += pan[i][i];
            hap2 += pan[i][pan.length - 1 - i];

        }
        max = Math.max(max, hap1);
        max = Math.max(max, hap2);


        System.out.println("max = " + max);





    }
}
