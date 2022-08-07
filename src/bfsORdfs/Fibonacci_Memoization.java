package bfsORdfs;


/**
 * 피보나치 수열
 *
 * 미리 선언해둔 클래스변수의 배열에 값을 넣어놓고
 * 나중에 똑같은 조건이 나왔을 때  스택을 또 쌓는게 아니라, 기존에 저장되어있는 값을 가져오게되면
 * 훨씬 속됴를 향상시킬 수 있다.
 *
 */
public class Fibonacci_Memoization {

    private static int[] fibo;

    public static void main(String[] args) {
        int n = 100;

        fibo = new int[n + 1];
        dfs(n);
        for (int i = 1; i <=  n; i++) {
            System.out.print(fibo[i] + " ");
        };
    }

    private static int dfs(int n) {
        if (fibo[n] == 0) {
            if (n == 1) return fibo[n] = 1;
            else if (n == 2) return fibo[n] = 1;
            else return fibo[n] = dfs(n - 2) + dfs(n - 1);
        } else {
            return fibo[n];
        }
    }
}
