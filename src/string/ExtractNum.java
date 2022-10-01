package string;

import java.util.Scanner;

public class ExtractNum {

    // 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
    // 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
    // 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.

    public String solution(String str) {

        return str.replaceAll("[^A-Z]", "");

    }

    public static void main(String[] args) {

        ExtractNum ex = new ExtractNum();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(ex.solution(str));
    }
}
