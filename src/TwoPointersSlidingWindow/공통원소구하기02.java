package TwoPointersSlidingWindow;

import java.util.*;

public class 공통원소구하기02 {

    // 내 방법 - 3/4 맞고 1개가 타임 초과
    private List<Integer> solutionV1(int n, int[] arr1, int m, int[] arr2) {

        List<Integer> answer = new ArrayList<>();
        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j) {
                    answer.add(i);
                }
            }
        }
        Collections.sort(answer);

        return answer;
    }

    // 강의 방법
    private List<Integer> solutionV2(int n, int[] arr1, int m, int[] arr2) {

        List<Integer> answer = new ArrayList<>();

        // 오름차순 정렬
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int a = 0;
        int b = 0;
        while (a < n && b < m) {

            if (arr1[a] < arr2[b]) {
                a++;
            } else if (arr1[a] == arr2[b]) {
                answer.add(arr1[a]);
                a++;
                b++;
            } else {
                b++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        공통원소구하기02 ex = new 공통원소구하기02();

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

        for (int answer : ex.solutionV2(n, arr1, m, arr2)) {
            System.out.print(answer + " ");
        }
    }
}
