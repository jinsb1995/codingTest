package day1;

import java.util.Arrays;

public class Average {
	
	
	// ������ ��� �ִ� �迭 arr�� ��� ���� return �ϴ� �Լ��� ������
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		solution(arr);
		
	}
	
	
	static double solution(int[] arr) {
		double result = 0;
		
		int sum = 0;
		
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		result = (double) sum / arr.length;
		System.out.println(sum);
		System.out.println(result);
		
		System.out.println(Arrays.toString(arr));
		
		
		
		return result;
	}
	
	
	
}