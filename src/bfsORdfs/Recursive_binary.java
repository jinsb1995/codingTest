package bfsORdfs;

import java.util.Scanner;

public class Recursive_binary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        dfs(n);

    }

    private static void dfs(int n) {

        if (n == 0) {
            return;
        } else {
            dfs(n/2);
            System.out.print(n%2 + " ");
        }
    }
}
