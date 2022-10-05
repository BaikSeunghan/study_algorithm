package array;

import java.util.Scanner;

public class 보이는학생02 {

    // 선생님이 N명의 학생을 일렬로 세웠습니다.
    // 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때,
    // 맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요.
    // (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)

    // 내 답안 - 오답 ㅠㅠ ( 채점에서 하나 틀린다 )
    public int solutionV1(int n, int[] arr) {

        int answer = 1;
        int key = arr[0];

        for (int i = 1; i < n; i++) {
            if (i == n - 1) {
                if (arr[i] > key) answer++;

            } else if ((arr[i] > key)) {
                key = arr[i];
                answer++;
            }
        }
        return answer;
    }

    // 답안
    public int solutionV2(int n, int[] arr) {

        int answer = 1;
        int key = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > key) {
                answer++;
                key = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        보이는학생02 ex = new 보이는학생02();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(ex.solutionV1(n, arr));
    }
}
