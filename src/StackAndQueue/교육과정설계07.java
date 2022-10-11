package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 교육과정설계07 {

    // 틀림 - 다시
    public String solutionV1(String str1, String str2) {

        String answer = "YES";

        Queue<Character> queue = new LinkedList<>();

        for (char x : str1.toCharArray()) {
            queue.offer(x);
        }

        for (int i = 0; i < str2.length(); i++) {

            if (queue.contains(str2.charAt(i)) && str2.charAt(i) == queue.peek()) {
                if (str2.charAt(i) == queue.peek()) {
                    queue.poll();
                } else {
                    return answer = "NO";
                }
            }
        }
        return answer;
    }

    // 답안
    public String solutionV2(String str1, String str2) {

        String answer = "YES";

        Queue<Character> queue = new LinkedList<>();

        for (char x : str1.toCharArray()) {
            queue.offer(x);
        }

        for (char x : str2.toCharArray()) {
            if (queue.contains(x)) {
                // 어쨌든 모두 poll을 해서 비교
                if (x != queue.poll()) {
                    return "NO";
                }
            }
        }
        // 필수 과목을 이수안할 경우
        if (!queue.isEmpty()) {
            return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {

        교육과정설계07 ex = new 교육과정설계07();

        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.next();
        String str2 = scanner.next();

//        System.out.println(ex.solutionV1(str1, str2));
        System.out.println(ex.solutionV2(str1, str2));

    }
}
