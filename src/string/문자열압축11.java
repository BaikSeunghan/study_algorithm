package string;

import java.util.Scanner;

public class 문자열압축11 {

    // 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
    // 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
    // 단 반복횟수가 1인 경우 생략합니다.

    // 나의 문제풀이 - 틀림
    public String solutionV1(String str) {

        String answer = "";
        int cnt = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                if (cnt == 1) {
                    answer += str.charAt(i);
                } else {
                    answer += str.charAt(i) + "" + cnt;
                    cnt = 1;
                }
            }
            if (i + 1 == str.length() - 1 && cnt == 1) {
                answer += str.charAt(i + 1);
            }
        }
        return answer;
    }

    public String solutionV2(String str) {

        // str.charAt(i) == str.charAt(i + 1) 조건 유지를 위해서
        // 받은 문자열 뒤에 빈 문자를 붙여준다
        String answer = "";
        str = str + " ";
        int cnt = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                if (cnt == 1) {
                    answer += str.charAt(i);
                } else {
                    answer += str.charAt(i) + "" + cnt;
                    cnt = 1;
                }
            }
        }
        return answer;
    }



    public static void main(String[] args) {

        문자열압축11 ex = new 문자열압축11();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

//        System.out.println(ex.solutionV1(str));
        System.out.println(ex.solutionV2(str));

    }
}
