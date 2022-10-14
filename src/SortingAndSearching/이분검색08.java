package SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class 이분검색08 {

    // 임의의 N개의 숫자가 입력으로 주어집니다. N개의 수를 오름차순으로 정렬한 다음 N개의 수 중 한 개의 수인 M이 주어지면
    // 이분검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램을 작성하세요. 단 중복값은 존재하지 않습니다

    // 내 풀이 1/5
    private int solutionV1(int n, int m, int[] arr) {

        int ansnwer = 0;
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        int mid = (end + start) / 2;

        if (mid == m) {
            return ansnwer += mid + 1;
        } else {
            for (int i = m + 1; i < end; i++) {
                if (arr[i] == m) {
                    ansnwer = i + 1;
                }
            }
        }

        for (int i = 0; i <= mid; i++) {
            if (arr[i] == m) {
                ansnwer = i + 1;
            }
        }
        return ansnwer;
    }

    // 이분검색을 배워보자
    private int solutionV2(int n, int m, int[] arr) {

        int ansnwer = 0;
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (end + start) / 2;
            if (arr[mid] == m) {
                return mid + 1;
            } else if (arr[mid] > m) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ansnwer;
    }

    public static void main(String[] args) {

        이분검색08 ex = new 이분검색08();

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
