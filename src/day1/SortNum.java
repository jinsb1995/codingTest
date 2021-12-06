package day1;

public class SortNum {
	
	public static void main(String[] args) {
		
		int num = 18493;
		Long a = solution(num);
		System.out.println(a);
		
	}
	
	public static Long solution(int a) {
		Long result = 0L;
		String b = String.valueOf(a);
		int[] s = new int[b.length()];

		int tmp = 0;

		for(int i = 0; i < b.length(); i++) {
			s[i] = ((int) b.charAt(i) - '0');
		}

		for(int i = 0; i < b.length(); i++) {
			for(int j = 0; j < b.length(); j++) {
				if(s[i] > s[j]) {
					tmp = s[i];
					s[i] = s[j];
					s[j] = tmp;
				}
			}
		}
		
		String str = "";
		for(int i : s) {
			str += i;
		}
		
		result = Long.valueOf(str);
		
		return result;
	}

}
