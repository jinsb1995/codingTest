package stack;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        String str = sc.next();

        char[] strArr = str.toCharArray();

        Stack<Character> stack = new Stack<>();


        String answer = "YES";
        
        for (int i = 0; i < strArr.length; i++) {

            if (strArr[i] == '(') stack.push(strArr[i]);
            else {
                if (!stack.isEmpty()) stack.pop();
                else answer = "NO";
            }
        }

        if (!stack.isEmpty()) answer = "NO";
        System.out.println(answer);
//        (()(()))(()
//        (()))(
//        ((()())())))
    }

}
