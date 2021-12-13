package day1;

public class NewId {

	public static void main(String[] args) {
		
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		String result = solution(new_id);
		System.out.println(result);
	}
	
	static String solution(String new_id) {
		String answer = "";

		new_id = new_id.toLowerCase().replaceAll("[^a-z0-9-_.]", "");

		while (new_id.indexOf("..") != -1) {
			new_id = new_id.replaceAll("\\.\\.", ".");
		}

		new_id = new_id.startsWith(".") ? new_id.substring(1) : new_id;
		new_id = new_id.endsWith(".") ? new_id.substring(0, new_id.length() - 1) : new_id;

		new_id = new_id.equals("") ? new_id = "a" : new_id;

		if (new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
			if (new_id.endsWith(".")) {
				new_id = new_id.substring(0, new_id.length() - 1);
			}
		}

		if (new_id.length() <= 2) {
			for (int i = new_id.length(); i < 3; i++) {
				new_id += new_id.charAt(new_id.length() - 1);
			}
		}
		answer = new_id;
		return answer;
	}

}
