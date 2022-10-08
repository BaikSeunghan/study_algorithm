package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호01 {

    // 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
    // (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.

    // 다시풀어^^
    // 강의 - ( 넣고 ) 빼고, 두 가지 남은경우 리턴 NO
    public String solutionV2(String string) {
        String answer = "YES";

        Stack<Character> stack = new Stack<>();
        for (char x : string.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else {
                // ')'가 남은 상황
                if (stack.isEmpty()) {
                    return "NO";
                } else {
                    stack.pop();
                }
            }
        }
        // '('가 남은 상황
        if (!stack.isEmpty()) {
            return "NO";
        }
        return answer;
    }
    public static void main(String[] args) {

        올바른괄호01 ex = new 올바른괄호01();

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(ex.solutionV2(str));

    }
}
