package string;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWord04 {

    public ArrayList<String> solutionV1(int n, String[] str) {

        ArrayList<String> answer = new ArrayList<>();
        for (String s : str) {
            String temp = new StringBuilder(s).reverse().toString();
            answer.add(temp);
        }
        return answer;
    }

    // 변형 문제
    public ArrayList<String> solutionV2(int n, String[] str) {

        ArrayList<String> answer = new ArrayList<>();

        for (String s : str) {
            char[] chars = s.toCharArray();
            int lt = 0;
            int rt = s.length() - 1;

            while (lt < rt) {
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;
                lt++;
                rt--;
            }
            String temp = String.valueOf(chars);
            answer.add(temp);
        }
        return answer;
    }

    public static void main(String[] args) {

        ReverseWord04 reverseWord04 = new ReverseWord04();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = scanner.next();
        }

        for (String s : reverseWord04.solutionV1(n, str)) {
            System.out.println(s);
        }
        for (String s : reverseWord04.solutionV2(n, str)) {
            System.out.println(s);
        }

    }
}
