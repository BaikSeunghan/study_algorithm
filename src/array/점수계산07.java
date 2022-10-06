package array;

import java.util.Scanner;

public class 점수계산07 {

    // 정답
    public int solutionV1(int n, int[] arr) {

        int answer = 0;
        int cnt = 0;

        for (int x : arr) {
            if (x == 1) {
                cnt++;
                answer += cnt;
            } else {
                cnt = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        점수계산07 ex = new 점수계산07();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(ex.solutionV1(n, arr));
    }
}
