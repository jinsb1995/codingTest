package inflearn;

import java.util.Scanner;

public class ReversePrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String[] numStrArr = new String[n];
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numStrArr[i] = sc.next();
        }


        for (int i = 0; i < numStrArr.length; i++) {
            String num = numStrArr[i];

            for (int j = 0, z = num.length()-1; j < num.length()/2; j++, z--) {

                char[] chars = num.toCharArray();
                char tmp = chars[j];
                chars[j] = chars[z];
                chars[z] = tmp;
                num = String.valueOf(chars);

            }
            int number = Integer.valueOf(num);
            numbers[i] = number;

        }




        for (int i = 0; i < numbers.length; i++) {
            int count = 0;

            loopOut:
            for (int k = 1; k <= numbers[i]; k++) {
                if (numbers[i] % k == 0) count++;

                if (count > 2) break loopOut;
            }
            if (count <= 2 && numbers[i] != 1)
                System.out.print(numbers[i] + " ");


        }



//
//        for (int i = 0; i < nums.length; i++) {
//            int tmpNum = 0;
//            String numStr = String.valueOf(nums[i]);
//
//            for (int j = 0, z = numStr.length() - 1; j < numStr.length(); j++, z--) {
//                char[] chars = numStr.toCharArray();
//                char tmp = chars[j];
//                chars[j] = chars[z];
//                chars[z] = tmp;
//                numStr = String.valueOf(chars);
//            }
//            int num = Integer.valueOf(String.valueOf(numStr));
//            System.out.println("num = " + num);
//        }
//
        
    }


}
