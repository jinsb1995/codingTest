package day1;

public class HapBetweenTwoNumber {

	
	public static void main(String[] args) {
//		두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
//		예를들어 a = 3, b = 5인 경우 , 3 + 4 + 5 = 12 이므로 12를 리턴한다.
		
		int a = 5; 
		int b = 3;
		solution(a, b);
	}
	
	static long solution(int a, int b) {
		long result = 0;
		
		int tmp = 0;
		
		if(a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		
		for(int i = a; i <= b; i++) {
			System.out.println(i);
			result += i;
		}	
		
		return result;
	}
	
	
	
}
