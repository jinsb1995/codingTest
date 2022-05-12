package inflearn.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class FindCow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int e = sc.nextInt();

        int answer = bfs(s, e);
        System.out.println(answer);
    }

    private static int bfs(int s, int e) {

        Queue<Integer> q = new LinkedList<>();

        int[] move = {1, -1, 5};
        int[] check = new int[10001];

        check[s] = 1;

        q.offer(s);

        int level = 0;

        while (!q.isEmpty()) {

            int len = q.size();

            for (int i = 0; i < len; i++) {
                int findVal = q.poll();

                for (int j = 0; j < move.length; j++) {
                    int nextVal = findVal + move[j];

                    if (nextVal == e) return level+1;
                    if (nextVal >= 0 && nextVal <= 10000 && check[nextVal] == 0) {
                        check[nextVal] = 1;
                        q.offer(nextVal);
                    }
                }
            }

            level++;
        }


        return 0;
    }
}

//public class FindCow {
//
//    /* 송아지 찾기 */
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int s = sc.nextInt();
//        int e = sc.nextInt();
//
//        int answer = bfs(s, e);
//        System.out.println(answer);
//    }
//
//    private static int bfs(int s, int e) {
//
//        Queue<Integer> q = new LinkedList<>();
//
//        int[] move = {1, -1, 5};
//        int[] check = new int[10001];
//
//        check[s] = 1;
//
//        q.offer(s);
//
//        int level = 0;
//
//        while (!q.isEmpty()) {
//
//            int len = q.size();
//
//            for (int i = 0; i < len; i++) {
//
//                Integer findVal = q.poll();
//
//                for (int j = 0; j < move.length; j++) {
//                    int nextVal = findVal + move[j];
//
//                    if (nextVal == e) return level + 1;
//
//                    if (nextVal >= 0 && nextVal <= 10000 && check[nextVal] == 0) {
//                        check[nextVal] = 1;
//                        q.offer(nextVal);
//                    }
//                }
//            }
//            level++;
//        }
//
//        return 0;
//    }
//
//}
