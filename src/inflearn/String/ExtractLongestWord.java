package inflearn.String;

import java.util.Scanner;

/**
 * indexOf, substring
 */
public class ExtractLongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SentenceClass s = new SentenceClass(sc.nextLine(), sc);
        sc.close();
        s.findLongWord();
    }
}


class SentenceClass {
    private String inputText;
    private int min;   // 최소값
    private int pos;   // 공백위치
    private String longWord;

    public SentenceClass(String inputText, Scanner sc) {
        this.inputText = inputText;
    }

    public void findLongWord() {
        while ((pos = inputText.indexOf(" ")) != -1) {
            
            String tmp = inputText.substring(0, pos);
            int length = tmp.length();
            
            if(min < length) {
                min = length;
                longWord = tmp;
            }
            inputText = inputText.substring(pos+1);
        }
        if(min < inputText.length()) longWord = inputText;
        System.out.println("longWord = " + longWord);
    }
}

/**
 * split
 */
/*
public class ExtractLongestWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SentenceClass s = new SentenceClass();
        s.setInputText(sc.nextLine(), sc);
        sc.close();
        s.calc();
    }
}

class SentenceClass {
    private String[] inputText;
    private int min = Integer.MIN_VALUE;
    private String longWord;

    public void setInputText(String inputText, Scanner sc) {
        if (inputText.length() > 100) {
            System.out.println("입력값이 100자가 넘어가면 안됩니다.");
            String newStr = sc.nextLine();
            setInputText(newStr, sc);
        } else {
            this.inputText = inputText.split(" ");
        }
    }

    public void getLongWord(String t) {
        if(min < t.length()) {
            min = t.length();
            longWord = t;
        }
    }

    public void calc() {
        for(String str : inputText) {
            getLongWord(str);
        }
        System.out.println(longWord);
    }

}
*/


/**
 * 연습한거
 */
//class SentenceClass {
//    private String[] inputText;
//    private String longestStr = "";
//
//    public void setInputText(String inputText, Scanner sc) {
//        if(inputText.length() > 100) {
//            System.out.println("문자열은 100자를 넘어가지 않습니다.");
//            String newStr = sc.nextLine();
//            setInputText(inputText, sc);
//        } else {
//            this.inputText = inputText.split(" ");
//        }
//    }
//
//
//    // length 체크해서 가장 긴 단어 출력
//    public void findLongWord(String t) {
//        int tLen = t.length();
//        if(longestStr.length() < tLen) longestStr = t;
//    }
//
//    public void printStr() {
//        for (int i = 0; i < inputText.length; i++) {
//            findLongWord(inputText[i]);
//        }
//        System.out.println(longestStr);
//    }
//
//
//
//}