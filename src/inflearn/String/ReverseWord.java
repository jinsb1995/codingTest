package inflearn.String;

import java.util.Scanner;

public class ReverseWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = solution(sc);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static String[] solution(Scanner sc) {
        int n = sc.nextInt();
        String[] strArr = new String[n];
        String[] tmpArr = new String[n];

        for (int i = 0; i < n; i++) {
            strArr[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            char[] c = strArr[i].toCharArray();

            for (int j = 0, z = strArr[i].length()-1; j < z; j++, z--) {
                char tmp = c[j];
                c[j] = c[z];
                c[z] = tmp;
            }
            tmpArr[i] = String.valueOf(c);
        }

        return tmpArr;
    }


}
