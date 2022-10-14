package SortingAndSearching;

import java.util.Scanner;

public class 삽입정렬03 {

    private int[] solutionV1(int n, int[] arr) {

        // 굳이 마지막 인덱스는 돌릴 필요가 없기때문에
        for (int i = 1; i < n; i++) {
            // 삽입될 숫자
            int tmep = arr[i];
            int j = 0;
            for (j = i-1; j >= 0; j--) {
                if (arr[j] > tmep) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
                arr[j + 1] = tmep;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        삽입정렬03 ex = new 삽입정렬03();

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
