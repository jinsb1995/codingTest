package day1;

public class InsufficientMoney {

	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		int result = solution(price, money, count);
		System.out.println(result);
	}

	static int solution(int price, int money, int count) {
		int answer = 0;

		int tmpPrice = 0;

		for (int i = 1; i <= count; i++) {
			tmpPrice += price * i;
		}

		if (tmpPrice > money)
			answer = tmpPrice - money;
		else
			answer = 0;

		return answer;
	}
}
