package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 가위바위보03 {

    // 정답
    public List<String> solutionV1(int n, int[] arr1, int[] arr2) {

        List<String> answer = new ArrayList<>();
        // 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보
        for (int i = 0; i < n; i++) {
            if (arr1[i] == arr2[i]) {
                answer.add("D");
            } else if (arr1[i] == 1 && arr2[i] == 3) {
                answer.add("A");
            } else if (arr1[i] == 2 && arr2[i] == 1) {
                answer.add("A");
            } else if (arr1[i] == 3 && arr2[i] == 2) {
                answer.add("A");
            } else {
                answer.add("B");
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        가위바위보03 ex = new 가위바위보03();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }

        for (String x : ex.solutionV1(n, arr1, arr2)) {
            System.out.println(x);
        }
    }
}
