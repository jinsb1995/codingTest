package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RequiredClass {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        char[] required = sc.next().toCharArray();
        char[] classes = sc.next().toCharArray();

        Queue<Character> q = new LinkedList<>();
        for (char c : required) {
            q.offer(c);
        }

        String answer = "YES";


        for (int i = 0; i < classes.length; i++) {
            if (!q.isEmpty()) {
                if (q.peek() == classes[i]) q.poll();
            }

        }

        if (!q.isEmpty()) answer = "NO";


        System.out.println(answer);

    }
}
