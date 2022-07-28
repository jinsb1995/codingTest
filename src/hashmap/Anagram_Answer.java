package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram_Answer {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String strArr1 = sc.next();
        String strArr2 = sc.next();

        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char s : strArr1.toCharArray()) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (char c : strArr2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) answer = "NO";
            map.put(c, map.get(c) - 1);
        }

        System.out.println(answer);

    }
}
