package day_20210917;

public class MiddleNum {

	public static void main(String[] Args) {
		String s = "qwer";

		String result = solution(s);

		System.out.println(result);
	}

	static String solution(String s) {
		String answer = "";

        int idx = s.length() / 2;

        if(s.length() % 2 == 0) {
            answer = s.substring(idx - 1, idx + 1);
        } else {
            answer = s.substring(idx, idx + 1);
        }

        return answer;
	}
}
