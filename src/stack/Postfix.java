package stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * 후위식 연산
 */
public class Postfix {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String str = sc.next();

        Stack<Integer> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) stack.push(c - 48);
            else {
                Integer rt = stack.pop();
                Integer lt = stack.pop();
                if (c == '+') stack.push(lt + rt);
                if (c == '-') stack.push(lt - rt);
                if (c == '*') stack.push(lt * rt);
                if (c == '/') stack.push(lt / rt);
            }
        }

        int answer = stack.get(0);
        System.out.println(answer);



    }



}
/*
    3*(5+2)-9

    352+*9-
 */