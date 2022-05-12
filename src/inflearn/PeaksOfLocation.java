package inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class PeaksOfLocation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] location = new int[n+2][n+2];

        for (int i = 0; i < location.length; i++) {
            for (int j = 0; j < location[i].length; j++) {
                if ((i != 0 && i != location[i].length - 1) && (j != 0 && j != location[j].length-1) ) {
                    location[i][j] = sc.nextInt();
                } else {
                    location[i][j] = 0;
                }
            }
        }


        for (int i = 0; i < location.length; i++) {
            int[] ints = location[i];
            System.out.println();
            System.out.print(Arrays.toString(location[i]));
            System.out.println();
        }

        int peak = 0;

        for (int i = 1; i < location.length; i++) {
            for (int j = 1; j < location[i].length; j++) {
                int num = location[i][j];

                if ((i != 0 && i != location.length) && (j != 0 && j != location[i].length-1)) {

                    if ((num > location[i][j + 1] && num > location[i][j - 1])
                          && (num > location[i-1][j] && num > location[i+1][j])) peak++;

                }
            }
        }

        System.out.println(peak);



    }
}
