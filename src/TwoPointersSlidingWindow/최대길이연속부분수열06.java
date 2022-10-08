package TwoPointersSlidingWindow;

import java.util.Scanner;

public class 최대길이연속부분수열06 {

    // 0과 1로 구성된 길이가 N인 수열이 주어집니다.
    // 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다.
    // 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.
    // 만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면
    // 1 1 0 0 1 1 0 1 1 0 1 1 0 1
    // 여러분이 만들 수 있는 1이 연속된 연속부분수열의 길이는 8입니다.

    // 어렵다~ 다시 풀어보자
    private int solutionV1(int n, int m, int[] arr) {

        int answer = 0;
        int cnt = 0;
        int lt = 0;

        for (int rt = 0; rt < n; rt++) {

            // 나는 arr[rt] == 0 면 arr[rt] == 1, cnt++ 이런 문제풀이법으로
            // 접근했었는데, 잘못된 접근방식인 것 같다.
            if (arr[rt] == 0) {
                cnt++;
            }

            while (cnt > m) {
                // rt가 0->1로 바꿔놓은것을
                // 다시 1->0으로 수정
                if (arr[lt] == 0) {
                    cnt--;
                }
                lt++;
            }
            // 최소 길이가 1이기때문에 +1
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }

    public static void main(String[] args) {

        최대길이연속부분수열06 ex = new 최대길이연속부분수열06();

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
