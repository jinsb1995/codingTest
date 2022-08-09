package bfsdfs.dfs;

public class Factorial {

    public static void main(String[] args) {

        int n = 6;

        System.out.println("dfs(n) = " + dfs(n));
    }

    private static int dfs(int n) {
//        if (n == 1) {
//            return 1;
//        } else {
//            return n * dfs(n - 1);
//        }

        if (n == 1) {
            return 1;
        } else {
            int dfs = dfs(n - 1);
            return n * dfs;
        }

    }
}
