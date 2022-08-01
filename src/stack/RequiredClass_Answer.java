package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RequiredClass_Answer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        char[] required = sc.next().toCharArray();
        char[] classes = sc.next().toCharArray();

        Queue<Character> q = new LinkedList<>();
        for (char c : required) q.offer(c);
        
        String answer = "YES";
        
        for (int i = 0; i < classes.length; i++) {
            if (q.contains(classes[i]) && q.poll() != classes[i]) {
                answer = "NO";
                break;
            } 
        }

        if (!q.isEmpty()) answer = "NO";

        System.out.println("answer = " + answer);
    }
}
