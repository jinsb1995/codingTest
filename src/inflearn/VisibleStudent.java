package inflearn;

import java.util.Scanner;

public class VisibleStudent {

    public static void main(String[] args) {


        int solution = solution();
        System.out.println("solution = " + solution);
    }

    private static int solution() {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] key = new int[a];
        
        for (int i = 0; i < a; i++) {
            key[i] = sc.nextInt();
        }

        int count = 0;
        int max = 0;
        for (int i = 0; i < key.length; i++) {
            if (key[i] > max) {
                max = key[i];
                count++;
            }
        }
        
        
        return count;
    }
}

/*


    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] person = new int[a];

    for (int i = 0; i < a; i++) {
		person[i] = sc.nextInt();
    }

    int count = 0;
    int max = 0;
    for (int i = 0; i < person.length; i++) {
     	if (person[i] > max) {
     	    max = person[i];
         	count++;
        }
    }

    System.out.println(count);
    return ;


 */