package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 모든 아나그램 찾기 - HashMap, SlidingWindow
 * 아나그램
 *
 * 두 문자열이 순서만 다르고, 구성이 같을 때 두 문자열은 아나그램이라고 한다.
 */
public class FindAnagramCount {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < t.length; i++) {
            map.put(s[i], map.getOrDefault(s[i], 0) + 1);
            map2.put(t[i], map2.getOrDefault(t[i], 0) + 1);
        }

        int cnt = 0;

        if (map.equals(map2)) cnt++;

        int lt = 0;
        for (int i = t.length; i < s.length; i++) {

            map.put(s[i], map.getOrDefault(s[i], 0) + 1);

            if (map.get(s[lt]) != null) map.put(s[lt], map.get(s[lt]) - 1);

            if (map.get(s[lt]) == 0) map.remove(s[lt]);

            lt++;

            if (map.equals(map2)) cnt++;
        }
        System.out.println(cnt);

    }
}
