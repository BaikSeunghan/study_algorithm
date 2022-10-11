package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class 크레인인형뽑기03 {

    // 틀림 - 다시
    private int solutionV1(int n, int[][] arr1, int m, int[] arr2) {

        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < m; i++) {
            // a = 1
            int a = arr2[i];
            // 2차원 배열의 .length()는 행 크기
            // 2차원 배열의 열 크기는 arr[0].length()
            for (int j = 0; j < arr1.length; j++) {

                // arr[j][0]
                if (arr1[j][a - 1] != 0) {
                    stack.push(arr1[j][a - 1]);
                    if (stack.peek() == arr1[j][a - 1]) {
                        answer += 2;
                        stack.pop();
                    }
                    arr1[j][a - 1] = 0;
                    break;
                }
            }

        }
        return answer;
    }

    // 답안
    private int solutionV2(int n, int[][] arr1, int m, int[] arr2) {

        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i : arr2) {

            for (int j = 0; j < arr1.length; j++) {

                if (arr1[j][i - 1] != 0) {
                    int val = arr1[j][i - 1];
                    arr1[j][i - 1] = 0;
                    // stack.peek()는 값만 확인
                    if (!stack.isEmpty() && val == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(val);
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        크레인인형뽑기03 ex = new 크레인인형뽑기03();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] arr1 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }

        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }
//        System.out.println(ex.solutionV1(n, arr1, m, arr2));
        System.out.println(ex.solutionV2(n, arr1, m, arr2));

    }

}
