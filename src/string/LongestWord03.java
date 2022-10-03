package string;

import java.util.Scanner;

public class LongestWord03 {

    public String solutionV1(String str) {

        String answer = "";
        String[] split = str.split(" ");
        int set = 0;

        for (String s : split) {
            int length = s.length();
            if (length > set) {
                set = length;
                answer = s;
            }
        }
        return answer;
    }

    public String solutionV2(String str) {

        String answer = "";
        int set = 0, pos;

        // indexOf() : 값을 발견하지 못하면 -1을 리턴
        while ((pos = str.indexOf(" ")) != -1) {
            // pos 전까지 짤라옴. ex) pos = 3이면 0~2까지 해당
            String temp = str.substring(0, pos);
            int length = temp.length();
            if (length > set) {
                set = length;
                answer = temp;
            }
            str = str.substring(pos + 1);
        }
        // 마지막 단어가 str
        if (str.length() > set) {
            answer = str;
        }
        return answer;
    }

    public static void main(String[] args) {

        LongestWord03 longestWord03 = new LongestWord03();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.println(longestWord03.solutionV1(str));
        System.out.println(longestWord03.solutionV2(str));
    }
}
