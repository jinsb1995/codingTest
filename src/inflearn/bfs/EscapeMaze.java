package inflearn.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EscapeMaze {

    static class Point {
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[][] board, dis;

    static int[] dirX = {-1, 0, 1, 0};
    static int[] dirY = {0, 1, 0, -1};

    static Queue<Point> q = new LinkedList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        board = new int[n+1][n+1];
        dis = new int[n+1][n+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        bfs(1, 1);

    }

    private static void bfs(int x, int y) {

        q.offer(new Point(x, y));

        board[x][y] = 1;
        

    }

}
