package inflearn.String;

import java.util.Scanner;

public class WordDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CalcDistance cal = new CalcDistance();
        cal.setStr(sc.next(), sc);
        cal.setWord(sc.next());
        sc.close();

        int[] result = cal.printShortestDistance();

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}


class CalcDistance {
    private String str;
    private char word;
    private int distance;

    public void setStr(String str, Scanner sc) {
        if (str.length() > 100) {
            str = sc.nextLine().toLowerCase();
            setStr(str, sc);
        }
        this.str = str.toLowerCase();
    }

    public void setWord(String word) {
        this.word = word.toLowerCase().charAt(0);
    }

    public int[] printShortestDistance() {
        int[] result = new int[str.length()];
        increase(result);
        decrease(result);
        return result;
    }

    private void increase(int[] result) {
        distance = 1000;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != word) {
                distance++;
                result[i] = distance;
            } else {
                distance = 0;
            }
        }
    }

    private void decrease(int[] result) {
        distance = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != word) {
                distance++;
                result[i] = Math.min(result[i], distance);
            } else {
                distance = 0;
            }
        }
    }

}
