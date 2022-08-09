package bfsdfs.dfs;

import java.util.Scanner;

/**
 * 재귀함수 (스택 프레임)
 *
 * 이건 DFS 문제였다.
 */
public class Recursive_DFS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        recursive(n);

    }

    private static void recursive(int n) {
        if (n == 0) {
            return;
        } else {
            recursive(n - 1);
        }
        System.out.print(n + " ");
    }
}
