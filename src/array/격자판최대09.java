package array;

import java.util.Scanner;

public class 격자판최대09 {

    // 내 답안 - 틀림 다시 푸세요~
    public int solutionV1(int n, int[][] arr) {
        int answer = 0;
        int sum1 = 0;
        int max1 = 0;
        int sum2 = 0;
        int max2 = 0;
        int key = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                if (max1 < sum1) {
                    max1 = sum1;
                }
                sum2 += arr[j][i];
                if (max2 < sum2) {
                    max2 = sum2;
                }
                if (i == j) {
                    key += arr[i][j];
                }
            }
        }
        if (max1 > max2) {
            if (max1 > key) {
                answer = max1;
            }
        } else if (max1 < max2) {
            if (max2 > key) {
                answer = max2;
            }
        }

        return answer;
    }

    // 답안지
    public int solutionV2(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;

        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {

        격자판최대09 ex = new 격자판최대09();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(ex.solutionV2(n, arr));
    }
}
