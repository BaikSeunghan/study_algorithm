package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 에라토스테네스체05 {

    public List<Integer> solutionV1(int n) {

        List<Integer> answer = new ArrayList<>();
        answer.add(1);
        answer.add(1);

        for (int i = 1; i < n -1; i++) {
            answer.add(answer.get(i) + answer.get(i-1));
        }
        return answer;
    }

    public static void main(String[] args) {

        피보나치수열04 ex = new 피보나치수열04();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (Integer x : ex.solutionV1(n)) {
            System.out.print(x + " ");
        };
    }
}
