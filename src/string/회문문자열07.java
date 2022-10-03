package string;

import java.util.Scanner;

public class 회문문자열07 {

    // 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
    // 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
    // 단 회문을 검사할 때 대소문자를 구분하지 않습니다.

    // 내 답안
    public String solutionV1(String str) {

        String answer = str.toUpperCase();
        String answer2 = new StringBuilder(answer).reverse().toString();
        // equals()는 대소문자를 구분한다.
        // equalsIgnoreCase()는 대소문자 구분 X
        if (answer.equals(answer2)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    // 강의 답안
    public String solutionV2(String str) {

        String answer = "YES";
        int length = str.length();
        str = str.toUpperCase();

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return "NO";
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        회문문자열07 ex = new 회문문자열07();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(ex.solutionV1(str));
        System.out.println(ex.solutionV2(str));
    }
}

