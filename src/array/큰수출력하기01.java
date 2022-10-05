package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 큰수출력하기01 {

    // N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
    // (첫 번째 수는 무조건 출력한다)
    public List<Integer> solutionV1(int n, int[] arr) {

        List<Integer> answer = new ArrayList<>();
        // 0번은 무조건 크니까 먼저 넣어준다.
        answer.add(arr[0]);

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        큰수출력하기01 ex = new 큰수출력하기01();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (Integer x : ex.solutionV1(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
