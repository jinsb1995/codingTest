package stack;

import java.util.Scanner;
import java.util.Stack;

public class Bracket_Answer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));

    }

    private static String solution(String str) {

        String answer = "YES";

        Stack<Character> stack = new Stack<>();

        for (Character c : stack) {

            if (c == '(') stack.push(c);
            else {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }

        if (!stack.isEmpty()) return "NO";

        return answer;
    }
}
