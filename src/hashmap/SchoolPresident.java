package hashmap;

import java.util.*;

public class SchoolPresident {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        char[] cArr = new char[] { 'A', 'B', 'C', 'D', 'E'};

        String str = sc.next();

        if (str.length() > n) {
            throw new IllegalArgumentException("학생수를 넘었습니다.");
        }

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char student = str.charAt(i);
            if (map.get(student) != null) {
                map.replace(student, map.get(student) + 1);
            } else {
                map.put(student, 1);
            }
        }

        char president = ' ';
        int max = 0;
        for (int i = 0; i < cArr.length; i++) {
            if (max < map.get(cArr[i])) {
                max = map.get(cArr[i]);
                president = cArr[i];
            }
        }

        System.out.println(president);

        Map.Entry<Character, Integer> characterIntegerEntry = map.entrySet().stream().min(Map.Entry.comparingByValue(Comparator.reverseOrder())).get();
        System.out.println(characterIntegerEntry);

    }

    private static void createArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }
    }
}
