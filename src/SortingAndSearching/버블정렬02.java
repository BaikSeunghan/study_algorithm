package SortingAndSearching;

import java.util.Scanner;

public class 버블정렬02 {

    private int[] solutionV1(int n, int[] arr) {

        for (int i = 0; i < n-1; i++) {

            // 하나씩 채워지니까 -1
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        버블정렬02 ex = new 버블정렬02();

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
