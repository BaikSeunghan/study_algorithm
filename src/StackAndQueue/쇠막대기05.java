package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기05 {

    // 설명듣고 맞춤
    public int solutionV1(String string) {

        int answer = 0;

        Stack<Character> stack = new Stack<>();

        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == '(') {
                stack.push(chars[i]);
            } else {
                // 레이저 처리
                if (chars[i - 1] == '(') {
                    stack.pop();
                    answer += stack.size();
                } else {
                    // 막대기 끝처리
                    answer += 1;
                    stack.pop();
                }
            }
        }
        return answer;
    }

    // 강의 답안
    public int solutionV2(String string) {

        int answer = 0;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == '(') {
                stack.push('(');
            } else {
                // 요부분이 다름
                stack.pop();
                // 레이저 처리
                if (string.charAt(i - 1) == '(') {
                    answer += stack.size();
                } else {
                    // 막대기 끝처리
                    answer += 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        쇠막대기05 ex = new 쇠막대기05();

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(ex.solutionV1(str));

    }
}
