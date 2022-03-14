package day1;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int x = 0;
        int n = 5;

        long[] ans = new long[n];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = x * (i+1);
        }
        System.out.println(Arrays.toString(ans));

    }
}
