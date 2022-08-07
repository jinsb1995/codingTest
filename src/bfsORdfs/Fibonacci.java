package bfsORdfs;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <=  n; i++) {
            System.out.print(dfs(i) + " ");
        };
    }

    private static int dfs(int n) {
        if (n == 1) return 1;
        else if (n == 2) return 1;
        else return dfs(n - 2) + dfs(n - 1);
    }
}
