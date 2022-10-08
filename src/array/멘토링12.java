package array;

import java.util.Scanner;

public class 멘토링12 {

    // 틀림 - 처음으로 들어도 어렵네
    public int solutionV1(int n, int m, int[][] arr) {

        // (i,j) 짝
        // k 테스트
        // s 등수
        int answer = 0;

        for (int i = 1; i < n; i++) {

            for (int j = 1; j < n; j++) {

                int cnt = 0;
                for (int k = 0; k < m; k++) {

                    int pi = 0, pj = 0;
                    for (int s = 0; s < n; s++) {
                        if (arr[k][s] == i) pi = s;
                        if (arr[k][s] == j) pj = s;
                    }
                    if (pi < pj) cnt++;
                }
                if (cnt == m) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        멘토링12 ex = new 멘토링12();
        Scanner scanner = new Scanner(System.in);

        // n명의 학생
        int n = scanner.nextInt();
        // m번의 시험
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(ex.solutionV1(n, m, arr));

    }
}

