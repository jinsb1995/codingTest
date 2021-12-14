package day1;

import java.util.Arrays;

public class RemoveMinNum {

	public static void main(String[] args) {
		int[] arr = new int[] {36, 8, 22, 57, 12, 49};
		solution(arr);
	}

	static int[] solution(int[] arr) {
		int[] answer = {};
		int min = 9999;

		if(arr.length > 1) {
			answer = new int[arr.length - 1];

			for(int i = 0; i < arr.length; i++) {
				if(arr[i] < min) {
					min = arr[i];
				}
			}

			int index = 0;
			for(int a : arr) {
				if(a != min) {
					answer[index] = a;
					index++;
				}
			}
		} else {
			answer = new int[arr.length];
			answer[0] = -1;
		}
		System.out.println(Arrays.toString(answer));

		return answer;
	}
}
