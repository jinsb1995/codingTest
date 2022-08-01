package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class SavePrincess {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.offer(i+1);
        }


        for (int i = 0; i < n; i++) {
            int cnt = k;

            while (cnt-1 > 0) {
                Integer poll = q.poll();
                q.offer(poll);
                cnt--;
            }
            if (q.size() > 1) q.poll();

        }

        System.out.println(q.poll());
    }

}
