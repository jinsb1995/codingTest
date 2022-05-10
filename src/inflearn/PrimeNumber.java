package inflearn;

import java.util.Scanner;

public class PrimeNumber {

    /*

        소수가 되는 수의 배수를 지우면 남은 건 소수가 된다.

        소수가 무엇인지 찾을 필요가 없으며 2부터 자기 자신을 제외한 배수가 되는것을 지우면 된다.

     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean[] prime = new boolean[n + 1];

        // 0과 1은 이미 소수이기 때문에 할 필요가 없음
        prime[0] = prime[1] = true;


        for (int i = 2; i*i <= n; i++) {
            if (!prime[i]) {
                for (int j = i*i; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }


        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!prime[i]) count++;
        }

        System.out.println("count = " + count);

    }
}

class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        int result = 0;
        for (int i = 2; i <= n; i++) {

            int count = calc(i);

            if (count < 2) {
                result++;
            }
        }

        System.out.println(result);
    }

    private static int calc(int num) {

        int count = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}
