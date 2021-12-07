package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoNumPlus {
	
	public static void main(String[] args) {
		
		int[] numbers = new int[] {2,1,3,4,1}; // [2,3,4,5,6,7]
//		int[] numbers = new int[] {5,0,2,7}; //	[2,5,7,9,12]
		solution(numbers);
		
	}
	
	static int[] solution(int[] numbers) {
		// 서로 다른 인덱스를 더하고
		// 오름차순으로 담아 return
		int[] answer = {};

		List<Integer> list = new ArrayList<Integer>();


		for(int i = 0; i < numbers.length; i++) {
			for(int j = i+1; j < numbers.length; j++) {
				int a = numbers[i] + numbers[j];

				if(list.indexOf(a) == -1) {
					list.add(a);
				}
			}
		}
//		System.out.println(list.toString());


		int tmp;
		answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			for(int j = i; j < list.size(); j++) {
				if(list.get(i) > list.get(j)) {
					tmp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, tmp);
				}
			}
			answer[i] = list.get(i);
		}


//		for(int a : list) {
//			answer
//		}



		System.out.println(Arrays.toString(answer));

		return answer;
	}
}
