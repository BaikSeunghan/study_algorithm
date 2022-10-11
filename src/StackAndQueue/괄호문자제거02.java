package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거02 {

    // 입력된 문자열에서 소괄호 ( ) 사이에 존재하는
    // 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.

    public String solutionV1(String string) {
        String answer = "";

        Stack<Character> stack = new Stack<>();

        for (char x : string.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(') {
                }
            } else {
                stack.push(x);
            }
        }

        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {

        괄호문자제거02 ex = new 괄호문자제거02();

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(ex.solutionV1(str));

    }
}
