package day_20210917;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maraton {
	
	
	public static void main(String[] args) {
//		String[] participant = {"leo", "kiki", "eden"};
//		String[] completion = {"eden", "kiki"};
//		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
//		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		solution(participant, completion);
		
	}
	
	static String solution(String[] participant, String[] completion) {
		String result = "";
		
		List<String> part = new ArrayList<>(Arrays.asList(participant));
//		List<String> comp = new ArrayList<>(Arrays.asList(completion));
		
		
		for(int i = 0; i < completion.length; i++) {
			if(part.indexOf(completion[i]) != -1) {
				part.remove(part.indexOf(completion[i]));
			}
		}
		
		for(int i = 0; i < part.size(); i++) {
			System.out.println(part.get(i));
		}
		
		
		
		return result;
	}
}
