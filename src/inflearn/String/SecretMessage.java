package inflearn.String;

import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DecryptionClass dc = new DecryptionClass();
        dc.setWordCnt(sc.nextInt(), sc);
        dc.setMsg(sc.next());
        sc.close();

        String result = dc.decryption();
        System.out.println(result);
    }
}


class DecryptionClass {
    private int wordCnt;

    private String msg;

    public void setWordCnt(int wordCnt, Scanner sc) {
        if (wordCnt > 10) {
            System.out.println("문자의 개수는 10개를 넘지 않습니다.");
            wordCnt = sc.nextInt();
            setWordCnt(wordCnt, sc);
        }
        this.wordCnt = wordCnt;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String decryption() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < wordCnt; i++) {
            char[] subMsgArr = msg.substring(i*7, (i+1)*7).toCharArray();
            convertMsg(subMsgArr);

            sb.append(parsing(subMsgArr));
        }
        return sb.toString();
    }

    private char parsing(char[] subMsgArr) {
        return (char) Integer.parseInt(String.valueOf(subMsgArr), 2);
    }

    private void convertMsg(char[] subMsgArr) {
        for (int j = 0; j < subMsgArr.length; j++) {
            if (subMsgArr[j] == '#')
                subMsgArr[j] = '1';
            else
                subMsgArr[j] = '0';
        }
    }


}