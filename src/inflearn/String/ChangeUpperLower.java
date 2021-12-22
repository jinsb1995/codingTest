package inflearn.String;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ChangeUpperLower {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StrClass str = new StrClass();
        str.setInputText(sc.next(), sc);
        sc.close();
        str.integrationMethod();
    }

}

class StrClass {
    private char[] inputText;

    public void setInputText(String inputText, Scanner sc) {
        String regex = "^[a-zA-Z]*$";
        if(inputText.length() > 100) {
            System.out.println("문자열의 길이는 100을 넘지 않습니다.");
            setRecursive(sc);
        } else if (!Pattern.matches(regex, inputText)){
            System.out.println("영문자만 입력 가능합니다.");
            setRecursive(sc);
        } else {
            this.inputText = inputText.toCharArray();
        }
    }
    private void setRecursive(Scanner sc) {
        String newText = sc.next();
        setInputText(newText, sc);
    }

    // 소문자 -> 대문자로 변환
    public char changeToUpper(char t) {
//        t = (char) (t + 32);
        return Character.toUpperCase(t);
    }

    // 대문자 -> 소문자로 변환
    public char changeToLower(char t) {
//        t = (char)(t - 32);
        return Character.toLowerCase(t);
    }

    // 대문자인지 소문자인지 검증
    public char checkTextCase(char t) {
        if (Character.isUpperCase(t))
            return changeToLower(t);
        else
            return changeToUpper(t);
    }

    // 변환한걸 받아서 실제 배열에 담기
    public void updateInputArray(char t, int idx) {
        inputText[idx] = t;
    }

    // 호출해주는 곳
    public void integrationMethod() {
        for (int i = 0; i < inputText.length; i++) {
            updateInputArray(checkTextCase(inputText[i]), i);
        }
        System.out.println(inputText);
    }



}





























//public class ChangeUpperLower {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        // char 배열을 만든다.
//        StrClass str = new StrClass();
//        str.setInputText(sc.next());
//        str.validate();
//
//        // 글자수 100개
//        // 알파벳 헤ㅐ야함
//    }
//}
//
//// 대문자 65 - 90
//// 소문자 97 - 122
//
//class StrClass {
//    private char[] inputTextArray;
//
//    public void setInputText(String inputText) {
//        // String 을 받아서 char 배열을 만들어준다.
//        this.inputTextArray = inputText.toCharArray();
//    }
//
//    // 대문자로 변경하는데 검증은 이거 호출하는 곳에서 한다
//    public char changeUpperCase(char text) {
////       text = (char) (text + 32);
//        return Character.toUpperCase(text);
//    }
//    // 소문자로 변경하는데 검증은 이거 호출하는 곳에서 한다
//    public char changeLowerCase(char text) {
////       text = (char)(text - 32);
//        return Character.toLowerCase(text);
//    }
//
//    // 대소문자인지 검증하고 변경한 값을 return
//    public char changeCase(char text) {
//        if (Character.isLowerCase(text))
//            return changeUpperCase(text);
//        else
//            return changeLowerCase(text);
//    }
//
//    // 대소문자 변경 했으면 배열을 바꿔야한다.
//    public void updateArray(char text, int idx) {
//        inputTextArray[idx] = text;
//    }
//
//    // forEach 로 배열 안의 문자 하나하나 검증을 시도한다.
//    public void validate() {
//        for (int i = 0; i < inputTextArray.length; i++) {
//            updateArray(changeCase(inputTextArray[i]), i);
//        }
//        System.out.println(inputTextArray);
//    }
//
//
//
//}



















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