package com.example.demo.util;

import java.util.Scanner;

public class RepeatWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ValidClass valid = new ValidClass();
		valid.setTextArr(sc.next());
		sc.close();
		String result = valid.checkRecursiveWord();
		System.out.println(result);

	}


}


class ValidClass {
	private char[] textArr;

	private boolean isTrue = true;
	private String result;

	public void setTextArr(String text) {
		this.textArr = text.toLowerCase().toCharArray();
	}


	public String checkRecursiveWord() {
		for (int i = 0;  i < textArr.length; i++) {
			if(textArr[i] != textArr[(textArr.length - 1) - i]) {
				isTrue = false;
				break;
			}
		}
		if(isTrue) result = "YES";
		else result = "NO";

		return result;
	}




}