package TwoPointersSlidingWindow;

import java.util.Scanner;

public class 연속자연수합05 {

    // N입력으로 양의 정수 N이 입력되면 2개 이상의
    // 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
    // 만약 N=15이면
    // 7+8=15
    // 4+5+6=15
    // 1+2+3+4+5=15
    // 와 같이 총 3가지의 경우가 존재한다.

    // 정답
    private int solutionV1(int n) {

        int answer = 0;
        int sum = 0;
        int lt = 0;
        // 주어진 값의 절반값+1 자연수까지만 돌려도된다. (n / 2) + 1
        // 그대신 '<=' 해야한다.
        for (int rt = 0; rt <= (n / 2) + 1; rt++) {

            sum += rt;
            while (sum >= n) {
                sum -= lt;
                lt++;
                if (sum == n) {
                    answer++;
                }
            }
        }
        return answer;
    }

    // 강의 - 수학적인 방법
    private int solutionV2(int n) {

        int answer = 0;
        int cnt = 1;
        // cnt 1로 1을 뺏으니까 주어진 값에서 1을 뺀다.
        n--;

        while (n > 0) {
            cnt++;
            // 12 / 2 == 6. 1/2 -> 7.8
            // 9 / 3 == 3. 1/2/3 -> 4.5.6
            // 마지막에 0/5 == 0 -> true 되서 answer++
            n = n - cnt;
            if (n % cnt == 0) {
                answer++;
            }

        }


        return answer;
    }

    public static void main(String[] args) {

        연속자연수합05 ex = new 연속자연수합05();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(ex.solutionV1(n));
    }
}
