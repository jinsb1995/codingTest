package inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExtractNum {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            ExtractClass ec = new ExtractClass();
            ec.setText(br.readLine());
            br.close();
            System.out.println(ec.extractNum());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


class ExtractClass {
    private char[] textArr;

    public void setText(String text) {
        this.textArr = text.toCharArray();
    }

    public int extractNum() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < textArr.length; i++) {
            if (textArr[i] >= 48 && textArr[i] <= 57) {
                sb.append(textArr[i]);
            }
        }
        return stringToInt(sb.toString());
    }

    public int stringToInt(String str) {
        return Integer.valueOf(str);
    }
}