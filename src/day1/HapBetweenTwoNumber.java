package day1;

public class HapBetweenTwoNumber {

	
	public static void main(String[] args) {
//		�� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
//		������� a = 3, b = 5�� ��� , 3 + 4 + 5 = 12 �̹Ƿ� 12�� �����Ѵ�.
		
		
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
		
		
		System.out.println(result);
		return result;
	}
	
	
	
}