package stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveStrInsideBracket_Answer {

    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {


        String str = sc.next();

        Stack<Character> stack = new Stack<>();

        String answer = "";

        for (char c : str.toCharArray()) {
            if (c == ')') {
                while (stack.pop() != '(');
            } else {
                stack.push(c);
            }
        }

        for (int i = 0; i < stack.size(); i++)
            answer += stack.get(i);

        System.out.println(answer);

    }

}
