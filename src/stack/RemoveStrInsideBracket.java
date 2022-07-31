package stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveStrInsideBracket {

    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {


        String str = sc.next();

        Stack<Character> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        for (Character c : str.toCharArray()) {

            if (c == '(') stack.push(c);
            else {
                if (stack.isEmpty()) sb.append(c);
                if (c == ')') stack.pop();
            }
        }

        System.out.println(sb.toString());
//        (A(BC)D)EF(G(H)(IJ)K)LM(N)


    }

}
