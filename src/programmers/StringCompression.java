package programmers;

import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args) {

        String s = "xababcdcdababcdcd";
        int solution = solution(s);
        System.out.println("solution = " + solution);
    }

    public static int solution(String s) {
        int answer = s.length();

        for (int i = 1; i < s.length(); i++) {

            int count = 1;   // 압축된 횟수

            String str = s.substring(0, i);    // 압축할 문자

            StringBuilder sb = new StringBuilder();  // 압축한 문자열을 담아줄것

            for (int j = i; j <= s.length(); j += i) {

                // 압축할 문자열과 비교할 다음 문자열을 찾아야한다.
                String nextStr = s.substring(j, j + i > s.length() ? s.length() : j+i);

                
                if (str.equals(nextStr)) {  // 압축할 문자열과 비교할 다음 문자열이 같으면 압축된 횟수를 추가해준다.
                    count++;
                } else {
                    sb.append(count > 1 ? count : "").append(str);   // 새로운 문자열을 생성해서 count와 압축된 문자를 추가시켜준다.
                    str = nextStr;    // 현재 문자열을 새로운 다음 문자열로 바꿔준다.
                    count = 1;     // 압축된 횟수는 1로 초기화해준다.
                }

            }

            sb.append(str);
            answer = answer <= sb.toString().length() ? answer : sb.toString().length();
        }

        return answer;

    }

}
