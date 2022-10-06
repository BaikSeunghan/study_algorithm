package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class 등수구하기08 {

    // N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
    // 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
    // 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.

    // 세모
    public int[] solutionV1(int n, int[] arr) {

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }

    public static void main(String[] args) {

        등수구하기08 ex = new 등수구하기08();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int x : ex.solutionV1(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
