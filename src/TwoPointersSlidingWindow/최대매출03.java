package TwoPointersSlidingWindow;

import java.util.*;

public class 최대매출03 {

    // 현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
    // 만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
    // 12 1511 20 2510 20 19 13 15
    // 연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.

    // 내 방법 - 노답,,, 다시 푸세요~
    private int solutionV1(int n, int m, int[] arr1) {

        int answer = 0;
        int sum = 0;
        int temp = 0;

        for (int i = 0; i < n - m + 1; i++) {

            for (int j = 0; j < m; j++) {
                int val = arr1[i + j];
                temp += val;
            }
            if (sum < temp) {
                sum = temp;
            }
            answer = sum;
        }

        return answer;
    }

    // 강의 방법
    private int solutionV2(int n, int m, int[] arr1) {

        int answer = 0;
        int sum = 0;

        for (int i = 0; i < m; i++) {
            sum += arr1[i];
            answer = sum;
        }

        for (int i = m; i < n; i++) {
            sum += (arr1[i] - arr1[i-m]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args) {

        최대매출03 ex = new 최대매출03();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }


//        System.out.println(ex.solutionV1(n, m, arr1));
        System.out.println(ex.solutionV2(n, m, arr1));
    }
}
