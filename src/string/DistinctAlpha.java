package string;

import java.util.Scanner;

public class DistinctAlpha {

    // 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
    // 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
    public String solutionV1(String str) {

        String answer = "";
        char[] chars = str.toCharArray();

        for (char x : chars) {
            if (!answer.contains(String.valueOf(x))) {
                answer += x;
            }
        }

        return answer;
    }

    // indexOf()를 활용
    public String solutionV2(String str) {

        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        DistinctAlpha distinctAlpha = new DistinctAlpha();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(distinctAlpha.solutionV1(str));
        System.out.println(distinctAlpha.solutionV2(str));
    }
}
