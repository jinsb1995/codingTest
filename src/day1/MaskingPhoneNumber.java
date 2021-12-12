package day1;

public class MaskingPhoneNumber {
	
	public static void main(String[] args) {
		String phone = "01011112222";
		solution(phone);
	}

	static String solution(String phone) {
		String str = "";

		int size = phone.length();

		String maskingNum = phone.substring(0, size - 4).replaceAll("[0-9]", "*");
		String lastNum = phone.substring(size - 4, size);

		System.out.println(maskingNum+lastNum);


		return str;
	}

}
