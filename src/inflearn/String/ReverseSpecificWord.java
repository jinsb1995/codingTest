package inflearn.String;

import java.util.Scanner;

public class ReverseSpecificWord {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChangeWordClass cw = new ChangeWordClass();
		cw.setWord(sc.next());
		sc.close();
		System.out.println(cw.changeLoc());
		
	}
	
}


class ChangeWordClass {
	private char[] word;
	
	public void setWord(String word) {
		this.word = word.toCharArray();
	}
	
	public char[] changeLoc() {
		for (int i = 0, j = word.length - 1; i < j; i++, j--) {
			if(Character.isAlphabetic(word[i])) {
				char tmp = word[j];
				word[j] = word[i];
				word[i] = tmp;				
			}

		}
		return word;
	}
}