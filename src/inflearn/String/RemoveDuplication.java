package inflearn.String;

import javax.print.attribute.standard.Compression;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveDuplication {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            CompressionClass cc = new CompressionClass();
            cc.setStrArr(br.readLine(), br);
            String compression = cc.compression();
            System.out.println(compression);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


class CompressionClass {
    private char[] strArr;

    private int cnt = 1;

    public void setStrArr(String str, BufferedReader br) throws IOException {
        if (str.length() > 100) {
            System.out.println("문자열의 길이는 100을 넘지 않습니다.");
            str = br.readLine();
            setStrArr(str, br);
        }
        this.strArr = str.toCharArray();
    }

    public String compression() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strArr.length; i++) {

            // 마지막 문자를 출력해주고 멈추는데 cnt가 1이상이면 cnt도 함께 출력해준다.
            if (i == strArr.length - 1) {
                sb = cnt > 1 ? sb.append(strArr[i]).append(cnt) : sb.append(strArr[i]);
                break;
            }

            // 연속되는 문자가 있으면 cnt + 1
            if (strArr[i] == strArr[i+1]) {
                cnt++;
            } else {
                // 더이상 연속되는 문자가 아니면 출력
                sb.append(strArr[i]);
                // 연속되는 문자가 1 이상이면 문자 뒤에 cnt를 붙여준다.
                if (cnt > 1) sb.append(cnt);
                // 다시 연속되는지 확인해야 하기 때문에 cnt를 1로 초기화
                cnt = 1;
            }

        }
        return sb.toString();
    }


}