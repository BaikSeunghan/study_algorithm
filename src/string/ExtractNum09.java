package string;

import java.util.Scanner;

public class ExtractNum09 {

    // 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
    // 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
    // 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.

    // 내 문제풀이 - 정답
    public int solutionV1(String str) {

        int answer = 0;
        char[] chars = str.toCharArray();

        for (char x : chars) {
            // '0'~'9'
            // 48 ~ 57
            if (x >= 48 && x <= 57) {
                // 문자에서 -48해야 실제 숫자가 된다.
                answer = answer * 10 + (x - 48);
            }
        }
        return answer;
    }

    public int solutionV2(String str) {

        String answer = "";
        char[] chars = str.toCharArray();

        for (char x : chars) {
            if (Character.isDigit(x)) {
                answer += x;
            }
        }
        // 맨 앞에 0을 지우기위해서
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {

        ExtractNum09 ex = new ExtractNum09();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(ex.solutionV1(str));
        System.out.println(ex.solutionV2(str));
    }
}
