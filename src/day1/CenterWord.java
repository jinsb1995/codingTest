package day1;

public class CenterWord {

	public static void main(String[] args) {
		String str = "test";
		String result = solution(str);
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
