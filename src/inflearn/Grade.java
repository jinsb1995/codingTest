package inflearn;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] scores = new int[n];
        
        
        for (int i = 0; i < n; i++) scores[i] = sc.nextInt();



        for (int i = 0; i < scores.length; i++) {
            int grade = n;
            
            for (int j = 0; j < scores.length; j++) {
                if (j != i) {
                    if (scores[i] >= scores[j]) {
                        grade--;
                    }
                }
            }
            System.out.println("grade = " + grade);
        }
    }
}
