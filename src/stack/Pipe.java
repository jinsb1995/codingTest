package stack;

import java.util.Scanner;
import java.util.Stack;

public class Pipe {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String str = sc.next();

        Stack<CustomMap> stack = new Stack<>();

        int pipe = 0;

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];

            if (c == '(') {
                stack.push(new CustomMap(i, c));
                pipe++;
            }


            if (c == ')') {
                if (i - stack.peek().getKey() == 1) {
                    stack.pop();
                    pipe = pipe - 1 + stack.size();
                } else {
                    stack.pop();
                }
            }
        }

        System.out.println(pipe);
    }

    static class CustomMap {
        private Integer key;
        private Character val;

        public CustomMap(Integer key, Character val) {
            this.key = key;
            this.val = val;
        }

        public Integer getKey() {
            return key;
        }
        public Character getVal() {
            return val;
        }

        @Override
        public String toString() {
            return "key=" + key + ", val=" + val;
        }
    }
}
