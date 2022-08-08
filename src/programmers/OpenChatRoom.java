package programmers;


import java.util.*;

public class OpenChatRoom {

    private static final String ENTER = "Enter";
    private static final String ENTER_MSG = "님이 들어왔습니다.";
    private static final String LEAVE = "Leave";
    private static final String LEAVE_MSG = "님이 나갔습니다.";
    private static final String CHANGE = "Change";


    private static Map<String, String> map = new HashMap<>();
    private static List<ChatroomInfo> list = new ArrayList<>();


    public static void main(String[] args) {

        String[] record = {
                  "Enter uid1234 Muzi"
                , "Enter uid4567 Prodo"
                , "Leave uid1234"
                , "Enter uid1234 Prodo"
                , "Change uid4567 Ryan"};

        String[] solution = solution(record);
        System.out.println("solution(record) = " + Arrays.toString(solution));
    }

    private static String[] solution(String[] record) {
        int cnt = 0;
        for (String value : record) {
            String[] s = value.split(" ");
            if (!s[0].equals(CHANGE)) cnt++;
        }
        String[] answer = new String[cnt];

        for (String value : record) {
            String[] s = value.split(" ");

            String status = s[0];
            String userId = s[1];
            String nickname = "";
            String message = "";

            if (ENTER.equals(status)) {

                nickname = s[2];
                message = ENTER_MSG;
                list.add(new ChatroomInfo(userId, nickname, message));

            } else if (LEAVE.equals(status)) {

                nickname = map.get(userId);
                message = LEAVE_MSG;
                list.add(new ChatroomInfo(userId, nickname, message));

            } else if (CHANGE.equals(status)) {

                nickname = s[2];
            }

            map.put(userId, nickname);

        }
        map.forEach((key, value) -> changeNickname(answer, key, value));

        return answer;
    }

    private static void changeNickname(String[] answer, String userId, String nickname) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUserId().equals(userId)) {
                answer[i] = nickname + list.get(i).getMessage();
            }
        }
    }


}
class ChatroomInfo {
    private String userId;
    private String nickname;
    private String message;

    public ChatroomInfo(String userId, String nickname, String message) {
        this.userId = userId;
        this.nickname = nickname;
        this.message = message;
    }

    public String getUserId() {
        return userId;
    }

    public String getMessage() {
        return message;
    }
}
