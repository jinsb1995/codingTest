package day1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Divisor {
    public static void main(String[] args) {

        int left = 24;
        int right = 27;
        int result = 0;

        for (int i = left; i <= right; i++) {

            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }

            if (cnt % 2 == 0)
                result += i;
            else
                result -= i;
            System.out.println(i + " : " + cnt);
        }

        System.out.println(result);


    }
}
