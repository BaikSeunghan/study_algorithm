package TwoPointersSlidingWindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 배열합치기01 {

    // 내가 푼 방법
    private List<Integer> solutionV1(int n, int[] arr1, int m, int[] arr2) {

        List<Integer> answer = new ArrayList<>();
        for (int i : arr1) {
            answer.add(i);
        }
        for (int i : arr2) {
            answer.add(i);
        }
        Collections.sort(answer);

        return answer;
    }

    // 강의 방법
    private List<Integer> solutionV2(int n, int[] arr1, int m, int[] arr2) {

        // 1. 서로 하나씩 비교해가면서 넣는 방식
        // 2. 넣은 쪽에서 ++해서 이동한다.
        // 3. 한쪽이 먼저 끝나면 남은쪽을 처리한다.
        List<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {

            if (arr1[p1] < arr2[p2]) {
                // 값을 add하고 , 그 이후에 +1 된다.
                answer.add(arr1[p1++]);
            } else {
                answer.add(arr2[p2++]);
            }
        }
        while (p1 < n) {
            answer.add(arr1[p1++]);
        }
        while (p2 < m) {
            answer.add(arr2[p2++]);
        }
        return answer;
    }

    public static void main(String[] args) {

        배열합치기01 ex = new 배열합치기01();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }

        for (int answer : ex.solutionV1(n, arr1, m, arr2)) {
            System.out.print(answer + " ");
        }
        for (int answer : ex.solutionV2(n, arr1, m, arr2)) {
            System.out.print(answer + " ");
        }
    }
}
