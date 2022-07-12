package inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatWord {
	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			ValidClass vc = new ValidClass();
			vc.setInput(br.readLine(), br);
			br.close();
			String result = vc.checkRecursiveWord();
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}


class ValidClass {
	private char[] input;

	private boolean isTrue = true;

	private String result;

	public void setInput(String text, BufferedReader br) throws IOException {
		if (text.trim().length() > 100) {
			System.out.println("공백을 제외한 100자까지만 입력이 가능합니다.");
			text = br.readLine();
			setInput(text, br);
		}
		this.input = text.toLowerCase().toCharArray();
	}

	public String checkRecursiveWord() {

		for (int i = 0; i < input.length; i++) {
			if (input[i] != input[(input.length - 1) - i]) {
				isTrue = false;
				break;
			}
		}
		if (isTrue) result = "YES";
		else result = "NO";

		return result;
	}

}


