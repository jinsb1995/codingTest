package inflearn.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EscapeMaze {

    static int[][] board, dis;

    static int[] dirX = {-1, 0, 1, 0};
    static int[] dirY = {0, 1, 0, -1};

    static Queue<Point> q = new LinkedList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        board = new int[8][8];
        dis = new int[8][8];

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        bfs(1, 1);

        if (board[7][7] == 0) {
            System.out.println("-1");
        } else {
            System.out.println(dis[7][7]);
        }

    }

    private static void bfs(int x, int y) {

        q.offer(new Point(x, y));

        board[x][y] = 1;

        while (!q.isEmpty()) {

            Point poll = q.poll();

            for (int i = 0; i < dirX.length; i++) {

                int nx = poll.x + dirX[i];
                int ny = poll.y + dirY[i];

                // nx, ny는 좌표니까 1 ~ 7사이 이어야 한다.
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[poll.x][poll.y]+1;
                }
            }
        }
    }



    static class Point {
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


}
