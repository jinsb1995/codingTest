package hashmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SchoolPresident_Answer {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        String str = sc.next();

        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
//            System.out.println(x + " " + map.get(x));
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        System.out.println(answer);

    }
}
