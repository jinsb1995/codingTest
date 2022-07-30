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
public class FindAnagramCount_Answer {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        int answer = 0;
        for (char c : t) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        int L = t.length - 1;
        for (int i = 0; i < L; i++) {
            sMap.put(s[i], sMap.getOrDefault(s[i], 0) + 1);
        }

        int lt = 0;
        for (int i = L; i < s.length; i++) {
            sMap.put(s[i], sMap.getOrDefault(s[i], 0) + 1);
            if (sMap.equals(tMap)) answer++;
            sMap.put(s[lt], sMap.get(s[lt]) - 1);
            if (sMap.get(s[lt]) == 0) sMap.remove(s[lt]);
            lt++;

        }

        System.out.println(answer);

    }
}
