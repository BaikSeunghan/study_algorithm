package SortingAndSearching;

import java.util.Scanner;

public class LRU04 {

    private int[] solutionV1(int n, int m, int[] arr) {

        int[] ansnwer = new int[n];

        for (int x : arr) {

            // 히트된 인덱스를 저장하기위한 필드
            int pos = 0;
            for (int i = 0; i < n; i++) {
                if (x == ansnwer[i]) {
                    pos = i;
                }
            }
            // 미스 처리
            if (pos == 0) {
                for (int i = n - 1; i >= 1; i--) {
                    // 땡기는 작업
                    ansnwer[i] = ansnwer[i - 1];
                }
            } else {
                // 히트 처리
                for (int i = pos; i >= 1; i--) {
                    ansnwer[i] = ansnwer[i - 1];
                }
            }
            ansnwer[0] = x;
        }

        return ansnwer;
    }

    public static void main(String[] args) {

        LRU04 ex = new LRU04();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i : ex.solutionV1(n, m, arr)) {
            System.out.print(i + " ");
        }

    }
}
