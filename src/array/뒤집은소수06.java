package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 뒤집은소수06 {

    // N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
    // 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
    // 첫 자리부터의 연속된 0은 무시한다.

    // 틀림 - 다시 풀것
    public List<Integer> solutionV1(int n, int[] arr) {

        List<Integer> answer = new ArrayList<>();
//        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());

        // https://zetawiki.com/wiki/%EC%9E%90%EB%B0%94_int_%EB%B0%B0%EC%97%B4%EC%9D%84_String%EC%9C%BC%EB%A1%9C_%EB%B3%80%ED%99%98
        // int[] -> String[]
        String[] split = Arrays.toString(arr).replaceAll("[^0-9 ]", "").split(" ");

        for (int i = 0; i < split.length; i++) {
            // 뒤집기
            split[i] = new StringBuilder(split[i]).reverse().toString();
        }

        // String[] -> int[]
        int[] ints = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();
        int[] temp = new int[ints.length + 1];

        for (int i = 0; i < ints.length; i++) {
            if (temp[i] == 0) {
                answer.add(ints[i]);
                for (int j = i; j <= n; j = j + i) {
                    temp[j] = 1;
                }
            }
        }

        return answer;
    }

    // 답안
    public List<Integer> solutionV2(int n, int[] arr) {

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            // reverse 뒤집힌 숫자
            int reverse = 0;
            while (temp > 0) {
                // 뒤집기 작업 시작
                int t = temp % 10; // 어떤 숫자를 10으로 나눈 나머지는 항상 1의 자리 숫자
                reverse = reverse * 10 + t; //
                temp = temp / 10;
            }
            if (isPrime(reverse)) {
                answer.add(reverse);
            }
        }

        return answer;
    }

    public boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            // 약수가 발견되면 '아니다'
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        뒤집은소수06 ex = new 뒤집은소수06();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i : ex.solutionV2(n, arr)) {
            System.out.print(i + " ");
        }
    }
}
