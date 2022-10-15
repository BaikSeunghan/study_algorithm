package SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class 뮤직비디오09 {

    // 이분검색 활용
    // 결정알고리즘 문제
    private int solutionV1(int n, int m, int[] arr) {

        int ansnwer = 0;
//        int lt = arr[arr.length - 1];
//        int rt = 0;
//        for (int i : arr) {
//            rt += i;
//        }
        // 가장 큰값
        int lt = Arrays.stream(arr).max().getAsInt();
        // arr의 총합
        int rt = Arrays.stream(arr).sum();

        // 어느순간 lt가 더 커진다.
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) <= m) {
                ansnwer = mid;
                // 더 좋은답이 있으면 찾기 위해
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        return ansnwer;
    }
    public int count(int[] arr, int capacity) {
        // cnt 는 DVD 장수, 한장은 필수니까 1로 시작
        int cnt = 1;
        int sum = 0;

        for (int i : arr) {
            sum += i;
            if (sum > capacity) {
                cnt++;
                sum = i;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {

        뮤직비디오09 ex = new 뮤직비디오09();

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
