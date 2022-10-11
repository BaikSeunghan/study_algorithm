package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 공주구하기06 {

    // 왕은 왕자들을 나이 순으로 1번부터 N번까지 차례로 번호

    public int solutionV1(int n, int m) {

        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            queue.offer(queue.poll());
            queue.offer(queue.poll());
            queue.poll();
            if (queue.size() == 1) {
                answer = queue.poll();
            }
        }
        return answer;
    }

    // 답안
    public int solutionV2(int n, int m) {

        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            // 여기가 포인트
            for (int i = 1; i < m; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
            if (queue.size() == 1) {
                answer = queue.poll();
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        공주구하기06 ex = new 공주구하기06();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

//        System.out.println(ex.solutionV1(n, m));
        System.out.println(ex.solutionV2(n, m));

    }
}
