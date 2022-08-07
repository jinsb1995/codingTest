package bfsORdfs;


/**
 * 피보나치 수열 하나씩 출력하기 위해서
 * 원래는 for문 안에 dfs(i)를 숫자가 증가될 때 마다 재귀를 계속 돌도록 했는데
 *
 * 이렇게 하면 배열에 담아서 하기 때문에 dfs(10)한번만 호출하면 그 뒤 배열에 결과값을 담아주기 때문에
 * 훨씬 향상된 성능을 보여준다.
 * 하지만 이것마저도 5~8초정도 걸리기 때문에 Memoization을 사용해서 성능을 향상시켜야 한다.
 *
 */
public class Fibonacci_2 {

    private static int[] fibo;

    public static void main(String[] args) {
        int n = 45;

        fibo = new int[n + 1];
        dfs(n);
        for (int i = 1; i <=  n; i++) {
            System.out.print(fibo[i] + " ");
        };
    }

    private static int dfs(int n) {
        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = dfs(n - 2) + dfs(n - 1);
    }
}
