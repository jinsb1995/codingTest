package inflearn.String;

import java.util.Scanner;

public class ReverseSpecificWord {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ChangeWordClass cw = new ChangeWordClass(sc.next());
		System.out.println(cw.changeWord());
	}
}

class ChangeWordClass {
	private char[] words;
	
	public ChangeWordClass(String word) {
		this.words = word.toCharArray();
	}
	
	public String changeWord() {
		int left = 0;
		int right = words.length - 1;
		
		while(left < right) {
//			if ((65 > words[left] && 90 > words[left]) || (97 > words[left] && 122 < words[left])) left++;
			if (!Character.isAlphabetic(words[left])) left++;
//			if ((65 > words[right] && 90 > words[right]) || (97 > words[right] && 122 < words[right])) right--;
			else if (!Character.isAlphabetic(words[right])) right--;
			else {
				char tmp = words[left];
				words[left] = words[right];
				words[right] = tmp;
				left++; right--;
			}
		}
		return String.valueOf(words);
	}
}

//public class ReverseSpecificWord {
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		ChangeWordClass cw = new ChangeWordClass();
//		cw.setWord(sc.next());
//		sc.close();
//		System.out.println(cw.changeLoc());
//	}
//}
//
//
//class ChangeWordClass {
//	private char[] word;
//	
//	public void setWord(String word) {
//		this.word = word.toCharArray();
//	}
//	
//	public char[] changeLoc() {
//		int lt = 0;
//		int rt = word.length - 1;
//		while (lt < rt) {
//			if (!Character.isAlphabetic(word[lt])) lt++;
//			else if (!Character.isAlphabetic(word[rt])) rt--;
//			else {
//				char tmp = word[lt];
//				word[lt] = word[rt];
//				word[rt] = tmp;
//				lt++;
//				rt--;
//			}
//		}
//		return word;
//	}
//}