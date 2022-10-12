package SortingAndSearching;

import java.util.Scanner;

public class 선택정렬01 {

    // 다시 - 어렵다잉
    private int[] solutionV1(int n, int[] arr) {

        // 굳이 마지막 인덱스는 돌릴 필요가 없기때문에
        for (int i = 0; i < n-1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[idx] > arr[j]) {
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {

        선택정렬01 ex = new 선택정렬01();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i : ex.solutionV1(n, arr)) {
            System.out.println(i + " ");
        }

    }
}
