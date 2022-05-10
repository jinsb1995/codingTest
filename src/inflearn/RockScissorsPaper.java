package inflearn;

import java.util.Scanner;

public class RockScissorsPaper {

    public static void main(String[] args) {

        // N 번의 게임을 진행
        // A가 이기면 A 출력
        // B가 이기면 B 출력
        // 비길경우 D 출력
        // 가위: 1,    바위: 2,      보: 3
        solution();
    }

    private static void solution() {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
             a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
             b[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {


            if (a[i] > b[i]) {
                if (a[i] - b[i] == 2) {
                    System.out.println("B");
                    continue;
                }
                System.out.println("A");

            } else if (a[i] < b[i]) {
                if (b[i] - a[i] == 2) {
                    System.out.println("A");
                    continue;
                }

                System.out.println("B");
            } else if (a[i] == b[i]) {
                System.out.println("D");
            }
        }




    }
}
