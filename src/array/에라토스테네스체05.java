package array;

import java.util.Scanner;

public class 에라토스테네스체05 {

    // 다시 풀어볼 것
    public int solutionV1(int n) {

        int answer = 0;
        int[] arr = new int[n + 1];
        // ----------------------
        for (int i = 2; i <= n; i++) {

            if (arr[i] == 0) {
                answer++;
                // 여기가 중요
                for (int j = i; j <= n; j = j + i) {
                    arr[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        에라토스테네스체05 ex = new 에라토스테네스체05();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(ex.solutionV1(n));
    }
}
