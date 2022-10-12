package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 응급실08 {

    // 못품
    class Person {
        int id;
        int prior;

        public Person(int id, int prior) {
            this.id = id;
            this.prior = prior;
        }
    }

    // 강의 답안
    public int solutionV2(int n, int m, int[] arr) {

        int answer = 0;
        Queue<Person> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.offer(new Person(i, arr[i]));
        }

        while (!queue.isEmpty()) {

            Person temp = queue.poll();
            // 진료를 받을 수 있는지 확인하는 for문
            for (Person person : queue) {
                if (person.prior > temp.prior) {
                    queue.offer(temp);
                    temp = null;
                    break;
                }
            }
            if (temp != null) {
                answer++;
                if (temp.id == m) {
                    return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        응급실08 ex = new 응급실08();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(ex.solutionV2(n, m, arr));

    }
}
