package string;

import java.util.Scanner;

public class 암호12 {

    // 내 답안 - 틀림(C까지는 나오는데 이후로 이상하게 나옴)
    public String solutionV1(String str, int n) {

        String answer = "";
        String temp = "";

        for (int i = 0; i < n; i++) {

            String s = str.substring(0, 7);
            for (char x : s.toCharArray()) {
                if (x == '#') {
                    temp += "" + 1;
                } else {
                    temp += "" + 0;
                }
            }
            char c = (char) Integer.parseInt(temp, 2);
            answer += c;

            str = str.substring(7);
        }
        return answer;
    }

    public String solutionV2(String str, int n) {

        String answer = "";

        for (int i = 0; i < n; i++) {
            String temp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            char c = (char) Integer.parseInt(temp, 2);
            answer += c;
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {

        암호12 ex = new 암호12();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String str = scanner.next();

        System.out.println(ex.solutionV1(str, n));
        System.out.println(ex.solutionV2(str, n));
    }
}
