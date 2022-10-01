package string;

import java.util.Scanner;

public class ReverseAlpha {

    public String solution(String str) {

        String answer = "";
        char[] chars = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(chars[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(chars[rt])) {
                rt--;
            } else {
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(chars);

        return answer;
    }

    public static void main(String[] args) {

        ReverseAlpha reverseAlpha = new ReverseAlpha();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(reverseAlpha.solution(str));
    }

}
