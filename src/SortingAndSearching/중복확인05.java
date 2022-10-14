package SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class 중복확인05 {

    // 현수네 반에는 N명의 학생들이 있습니다.
    // 선생님은 반 학생들에게 1부터 10,000,000까지의 자연수 중에서 각자가 좋아하는 숫자 하나 적어 내라고 했습니다.
    // 만약 N명의 학생들이 적어낸 숫자 중 중복된 숫자가 존재하면 D(duplication)를 출력하고,
    // N명이 모두 각자 다른 숫자를 적어냈다면 U(unique)를 출력하는 프로그램을 작성하세요.

    // 정답 ( 해시 사용하면 좋다고 한다 )
    private String solutionV1(int n, int[] arr) {

        String answer = "U";

        for (int i = 0; i < n; i++) {

            int tmep = arr[i];

            for (int j = i + 1; j < n; j++) {
                if (tmep == arr[j]) {
                    return "D";
                }
            }
        }
        return answer;
    }

    // 강의 답안 ( 해시(O(N))로 하는게 베스트인데, 정렬(nlogn)로도 할수있다는것을 보여주기위함)
    private String solutionV2(int n, int[] arr) {

        String answer = "U";
        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return "D";
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        중복확인05 ex = new 중복확인05();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(ex.solutionV1(n, arr));
    }
}
