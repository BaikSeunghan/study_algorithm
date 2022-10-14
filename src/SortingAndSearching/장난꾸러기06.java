package SortingAndSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 장난꾸러기06 {

    // 4/5 ㅠㅠㅠ 아쉽다
    private int[] solutionV1(int n, int[] arr) {

        int[] answer = new int[2];
        int pos1 = 0, pos2 = 0;

        for (int i = 0; i < n - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                pos1 = i;
                answer[0] = pos1 + 1;
                break;
            }
        }
        for (int i = n-1; i >= 1; i--) {
            if (arr[i] < arr[i - 1]) {
                pos2 = i;
                answer[1] = pos2 + 1;
                break;

            }
        }

        return answer;
    }

    // 강의 답안
    private List<Integer> solutionV2(int n, int[] arr) {

        List<Integer> answer = new ArrayList<>();

        int[] temp = arr.clone();
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (temp[i] != arr[i]) {
                answer.add(i + 1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        장난꾸러기06 ex = new 장난꾸러기06();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

//        for (int i : ex.solutionV1(n, arr)) {
//            System.out.print(i + " ");
//        }
        for (int i : ex.solutionV2(n, arr)) {
            System.out.print(i + " ");
        }
    }
}
