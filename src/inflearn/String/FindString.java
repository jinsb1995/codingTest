package inflearn.String;

import java.util.Scanner;

public class FindString {

    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        Scanner sc = new Scanner(System.in);
        WordClass wordClass = new WordClass();
        wordClass.setInputText(sc.next().toLowerCase(), sc);
        wordClass.setMatchText(sc.next().toLowerCase().charAt(0));
        sc.close();
        
        int result = wordClass.getDuplicateCount();
        System.out.println(result);

    }
    
    
    
}

class WordClass {

    private String inputText;
    private char matchText;
    private int matchCnt;

    public void setInputText(String inputText, Scanner sc) {
        // 문자열이 100자 이상 넘어가면 재귀호출을 한다.
        if (inputText.length() > 100) {
            System.out.println("문자열의 길이는 100을 넘지 않습니다.");
            String newInputText = sc.next().toLowerCase();
            setInputText(newInputText, sc);
        } else {
            this.inputText = inputText;
        }
    }

    public void setMatchText(char matchText) {
        this.matchText = matchText;
    }

    // matchText 와 동일한 문자가 있으면 count 증가
    private void isDuplicatePlus(char c) {
        if(matchText == c) matchCnt++;
    }

    // matchText 와 동일한 문자가 있는지 계산
    public int getDuplicateCount() {
        char[] chArr = inputText.toCharArray();
        for (char c : chArr) {
            isDuplicatePlus(c);
        }
        return matchCnt;
    }

}
















//
//public class FindString {
//
//    public static void main(String[] args) {
//        solution();
//    }
//
//    public static void solution() {
//        Scanner sc = new Scanner(System.in);
//        WordHouse h = new WordHouse();
//        h.setStr(sc.next().toLowerCase(), sc);
//        h.setWord(sc.next().toLowerCase());
//        sc.close();
//
//        System.out.println(h.getWordCnt());
//    }
//}
//
//class WordHouse{
//    private String inputText;
//    private String matchText;
//    private int matchTextCnt;
//
//    public String getStr() {
//        return inputText;
//    }
//    public void setStr(String inputText,Scanner sc) {
//        if (inputText.length() > 100){
//            System.out.println("100자 넘으면 안됩니다.");
//            String reStr = sc.next().toLowerCase();
//            setStr(reStr, sc);
//        } else {
//            this.inputText = inputText;
//        }
//    }
//    public String getWord() {
//        return matchText;
//    }
//    public void setWord(String matchText) {
//        this.matchText = matchText;
//    }
//
//    public void isDuplicatePlus(String splitedText) {
//        if (splitedText.equals(matchText)) matchTextCnt++;
//    }
//
//    int getWordCnt() {
//
//        for (int i = 0; i < inputText.length(); i++) {
//            String w = String.valueOf(inputText.charAt(i));
//            isDuplicatePlus(w);
//        }
//
//        return matchTextCnt;
//    }
//}