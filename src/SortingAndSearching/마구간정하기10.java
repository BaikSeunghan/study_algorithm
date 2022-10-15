package SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class 마구간정하기10 {

    // 결정알고리즘 문제
    private int solutionV1(int n, int m, int[] arr) {

        int ansnwer = 0;
        Arrays.sort(arr);

        // 거리를 구하는거니까 이렇게
        int lt = 1;
        int rt = arr[n - 1];
        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (count(arr, mid) >= m) {
                ansnwer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        return ansnwer;
    }

    public int count(int[] arr, int mid) {

        // 배치한 말 마리수
        int cnt = 1;
        // 무조건 제일 왼쪽 좌표
        int endposition = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - endposition >= mid) {
                cnt++;
                endposition = arr[i];
            }
        }

        return cnt;
    }

    public static void main(String[] args) {

        마구간정하기10 ex = new 마구간정하기10();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(ex.solutionV1(n, m, arr));
    }
}
