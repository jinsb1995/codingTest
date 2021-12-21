package inflearn.String;

import java.util.Scanner;

public class ChangeUpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // char 배열을 만든다.
        StrClass str = new StrClass();
        str.setInputText(sc.next());
        str.validate();

        // 글자수 100개
        // 알파벳 헤ㅐ야함
    }
}

// 대문자 65 - 90
// 소문자 97 - 122

class StrClass {
    private char[] inputTextArray;

    public void setInputText(String inputText) {
        // String 을 받아서 char 배열을 만들어준다.
        this.inputTextArray = inputText.toCharArray();
    }

    // 대문자로 변경하는데 검증은 이거 호출하는 곳에서 한다
    public char changeUpperCase(char text) {
//       text = (char) (text + 32);
        return Character.toUpperCase(text);
    }
    // 소문자로 변경하는데 검증은 이거 호출하는 곳에서 한다
    public char changeLowerCase(char text) {
//       text = (char)(text - 32);
        return Character.toLowerCase(text);
    }

    // 대소문자인지 검증하고 변경한 값을 return
    public char changeCase(char text) {
        if (Character.isLowerCase(text))
            return changeUpperCase(text);
        else
            return changeLowerCase(text);
    }

    // 대소문자 변경 했으면 배열을 바꿔야한다.
    public void updateArray(char text, int idx) {
        inputTextArray[idx] = text;
    }

    // forEach 로 배열 안의 문자 하나하나 검증을 시도한다.
    public void validate() {
        for (int i = 0; i < inputTextArray.length; i++) {
            updateArray(changeCase(inputTextArray[i]), i);
        }
        System.out.println(inputTextArray);
    }



}



















//public class ChangeUpperLower {
//
//    public static void main(String[] args) {
//        solution();
//    }
//
//    public static void solution() {
//        Scanner sc = new Scanner(System.in);
//        StrClass str = new StrClass();
//        str.setInputText(sc.next());
//        str.changeValue();
//
//    }
//
//
//}
//
//class StrClass {
//    private char[] inputArray;
//
//    public void setInputText(String inputText) {
//        this.inputArray = inputText.toCharArray();
//    }
//
//    // 대문자 65 - 90
//    // 소문자 97 - 122
//    public void caseChange(char text, int idx) {
//        // 대문자 검증
//        if (text < 91) {
//            updateArray(idx, toLower(text));
//        } else {
//            updateArray(idx, toUpper(text));
//        }
//    }
//
//    // 소문자로
//    public char toLower(char text) {
//        return (char)(text + 32);
//    }
//
//    // 대문자로
//    public char toUpper(char text) {
//        return (char)(text - 32);
//    }
//
//    // 그 배열에 넣어주는
//    public void updateArray(int idx, char text) {
//        inputArray[idx] = text;
//    }
//
//    public void changeValue() {
//
//        // 입력 받은 값을 배열에
//        for (int i = 0; i < inputArray.length; i++) {
//            caseChange(inputArray[i], i);
//        }
//        System.out.println(inputArray);
//    }
//}