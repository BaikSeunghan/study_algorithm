package string;

import java.util.Scanner;

public class 가장짧은문자거리10 {

    // 한 개의 문자열 s와 문자 t가 주어지면
    // 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
    public int[] solution(String str, char c) {

        // int[]이 필요한거까지는 맞췄다.
        int[] answer = new int[str.length()];
        int p = 100;

        // 왼쪽에서 오른쪽 방향
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        // 오른쪽에서 왼쪽 방향
        p = 100;
        for (int i = str.length() - 1; i >= 0; i--) {

            if (str.charAt(i) == c) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        가장짧은문자거리10 ex = new 가장짧은문자거리10();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        char c = scanner.next().charAt(0);

        int[] solution = ex.solution(str, c);
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }
}
