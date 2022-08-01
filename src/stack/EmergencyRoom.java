package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EmergencyRoom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Queue<CustomMap> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.offer(new CustomMap(i, sc.nextInt()));
        }

        int cnt = 0;

        while (!q.isEmpty()) {
            CustomMap poll = q.poll();

            for (CustomMap c : q) {
                if (poll.getValue() < c.getValue()) {
                    q.offer(poll);
                    poll = null;
                    break;
                }
            }

            if (poll != null) {
                cnt++;
                if (poll.getKey() == m) break;
            }
        }

        System.out.println(cnt);

    }


    static class CustomMap {
        private Integer key;
        private Integer value;

        public Integer getKey() {
            return this.key;
        }

        public Integer getValue() {
            return this.value;
        }


        public CustomMap(Integer key, Integer value) {
            this.key = key;
            this.value = value;
        }
    }

}
