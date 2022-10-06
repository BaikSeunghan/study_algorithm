package array;

import java.util.Scanner;

public class 봉우리10 {

    // 정답~
    public int solutionV1(int n, int[][] arr) {

        int answer = 0;
        for (int i = 1; i < n + 1; i++) {

            for (int j = 1; j < n + 1; j++) {
                if (arr[i][j] > arr[i-1][j] &&
                        arr[i][j] > arr[i][j-1] &&
                        arr[i][j] > arr[i+1][j] &&
                        arr[i][j] > arr[i][j+1]) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        봉우리10 ex = new 봉우리10();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] arr = new int[n + 2][n + 2];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(ex.solutionV1(n, arr));

    }
}
