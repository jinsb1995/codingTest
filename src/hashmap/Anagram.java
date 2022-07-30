package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Anagram
 * 두 문자열이 알파벳의 순서만 다르지만 구 구성이 일치하면 두 단어는 아나그램이라고 한다.
 */
public class Anagram {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] strArr1 = sc.next().split("");
        String[] strArr2 = sc.next().split("");

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (String s : strArr1) {
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }
        for (String s : strArr2) {
            map2.put(s, map2.getOrDefault(s, 0) + 1);
        }

        System.out.println(map1.equals(map2) ? "YES" : "NO");
//        System.out.println(map2);

    }
}
