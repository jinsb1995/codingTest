package day1;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Marathon_renew {

	public static void main(String[] args) {
//		String[] participant = {"leo", "kiki", "eden"};
//		String[] completion  = {"eden", "kiki"};
//		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
//		String[] completion  = {"josipa", "filipa", "marina", "nikola"};
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion  = {"stanko", "ana", "mislav"};


//		solution(participant, completion);
		String s = hashSolution(participant, completion);
		System.out.println(s);
	}

	static String solution(String[] participant, String[] completion) {

		Arrays.sort(participant);
		Arrays.sort(completion);

		int i = 0;
		for (i = 0; i < completion.length; i++)
			if (!participant[i].equals(completion[i]))
				break;


		System.out.println(participant[i]);


		return participant[i];
	}

	static String hashSolution(String[] participant, String[] completion) {
		String answer = "";

		Map<String, Integer> map = new HashMap<>();

		for (String name : participant)
			// key: 이름,  value: 1을 plus해주는데 동명이인이 있으면 거기에 plus해준다.
			map.put(name, map.getOrDefault(name, 0) + 1);

		for (String name : completion)
			// key: 이름,  value: key가 존재하면 1을 minus해준다.
			map.put(name, map.get(name) - 1);

		Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<String, Integer> next = it.next();

			// value가 0이상이면 그게 미완주자다.
			if (next.getValue() != 0) {
				answer = next.getKey();
				break;
			}

			System.out.println(next.getKey() + " : " + next.getValue());
		}

		return answer;
	}

}
