package bfsdfs.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 송아지 찾기1
 *
 * BFS (Breath-First Search)
 *
 * 문제에 [최소 ~ 몇 번 ] 이런 키워드가 있으면 이건 최단거리 알고리즘으로써
 * BFS를 적용하면 된다.
 *
 */
public class FindCow {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();

        System.out.println(bfs(s, e));
    }

    private static int bfs(int s, int e) {

        // q에 이미 있는 숫자를 또 넣으면 낭비니까
        // 배열로 그 숫자가 있는지 없는지 체크해서 없으면 넣어준다.
        int[] ch = new int[10001];
        ch[s] = 1;

        int[] jump = {1, -1, 5};

        Queue<Integer> q = new LinkedList<>();

        q.offer(s);

        int level = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            for (int i = 0; i < size; i++) {

                Integer poll = q.poll();

//                if (poll == e) return level;  // 여기서 return 하지 않는 이유는, 여기서 리턴하면 한번 더 돌고나서 poll하는 것이기 때문에 아래쪽에서 했다.


                for (int j = 0; j < jump.length; j++) {
                    int nextVal = poll + jump[j];

                    if (nextVal == e) return level + 1;
                    if (nextVal >= 1 && nextVal <= 10000 && ch[nextVal] == 0) {
                        ch[nextVal] = 1;
                        q.offer(nextVal);
                    }
                }
            }
            level++;

        }
        return 0;
    }

}
