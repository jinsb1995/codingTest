package inflearn.String;

import java.util.Scanner;

public class RemoveDuplicate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RemoveDuplicationClass fdc = new RemoveDuplicationClass();
        fdc.setInputText(sc.next(), sc);
        String result = fdc.getNotDuplicatedWord();
        System.out.println(result);
    }
}

class RemoveDuplicationClass {
    private String inputText;
    // String 은 불변 클래스라서 가변적으로 사용하려면 StringBuilder 를 사용해야함.
    private StringBuilder result = new StringBuilder();

    public void setInputText(String inputText, Scanner sc) {
        for (char ch : inputText.toCharArray()) {
            if (97 > ch && 122 > ch) {
                System.out.println("소문자만 입력 가능 합니다.");
                String newText = sc.next();
                setInputText(newText, sc);
                return;
            }
        }
        if (inputText.length() > 100)  {
            System.out.println("길이는 100을 넘길 수 없습니다.");
            String newText = sc.next();
            setInputText(newText, sc);
        } else {
            this.inputText = inputText;
        }
    }

    public String getNotDuplicatedWord() {

        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.indexOf(inputText.charAt(i)) == i) {
                result.append(inputText.charAt(i));
            }
        }
        return result.toString();
    }
}
