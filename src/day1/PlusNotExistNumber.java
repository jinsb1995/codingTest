package day1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PlusNotExistNumber {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,6,7,8,0};
//        int[] num = {5,8,4,0,6,7,9};

        boolean[] bol = new boolean[10];

        int result = 0;

        for (int i : num)
            bol[i] = true;

        for (int i = 0; i < bol.length; i++) {
            if (!bol[i])
                result += i;
        }

        System.out.println(result);




//        int tmp = 0;
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num.length; j ++) {
//                if (num[j] > num[i]) {
//                    tmp = num[j];
//                    num[j] = num[i];
//                    num[i] = tmp;
//                }
//            }
//        }
//        int reduce = IntStream.of(num).reduce(45, (a, b) -> a - b);
//        System.out.println(reduce);



//        int idx = 0;
//        while (idx <= num.length) {
//            if (idx == num[idx]) {
//                System.out.println(idx);
//            }
//            idx++;
//        }

//        for (int i = 0; i < tmpNum.length; i++) {
//            tmpNum[i] = i;
//        }

//        for (int i = 0; i < tmpNum.length; i++) {
//            for (int j = 0; j < num.length; j++) {
//                if (num[j] == tmpNum[i]) {
//                    System.out.println(tmpNum[i]);
//                }
//            }
//        }
//        System.out.println(Arrays.toString(num));
//        System.out.println(Arrays.toString(tmpNum));



//        for (int i = 0; i < num.length; i++) {
//            if (num[i] == i) {
//                continue;
//            } else {
//                result += i;
//            }
//        }

//        System.out.println(result);
    }
}
