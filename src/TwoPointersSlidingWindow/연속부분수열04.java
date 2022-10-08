package TwoPointersSlidingWindow;

import java.util.Scanner;

public class 연속부분수열04 {

    // N개의 수로 이루어진 수열이 주어집니다.
    // 이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
    // 만약 N=8, M=6이고 수열이 다음과 같다면
    // 1 2 1 3 1 1 1 2
    // 합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.

    // 키포인트 - O의 N제곱 문제를 O(n)으로 해결해서 푸는법을 배운다.
    // 틀림 - 2/5 (채점 2개맞음) 다시 풀기
    private int solutionV1(int n, int m, int[] arr1) {

        int answer = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i+1; j < n; j++) {
                sum += arr1[j-1];
                if (sum == m) {
                    cnt++;
                    break;
                }
            }
        }
        answer = cnt;
        return answer;
    }

    // 강의 방법 -
    private int solutionV2(int n, int m, int[] arr1) {

        int answer = 0;
        int sum = 0;
        int lt = 0;

        // rt 증가 더하고 합이 맞는지 확인, 크면 지금 lt값을 빼고 lt++
        // 그리고 다시 확인하고 같으면 cnt++
        for (int rt = 0; rt < n; rt++) {
            sum += arr1[rt];
            // sum은 lt~rt의 합
            if (sum == m) {
                answer++;
            }
            while (sum >= m) {
                sum -= arr1[lt];
                lt++;
                if (sum == m) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        연속부분수열04 ex = new 연속부분수열04();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.println(ex.solutionV2(n, m, arr1));
    }
}
