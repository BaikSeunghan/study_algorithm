package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 피보나치수열04 {


    // 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
    // 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
    public List<Integer> solutionV1(int n) {

        List<Integer> answer = new ArrayList<>();
        answer.add(1);
        answer.add(1);

        for (int i = 1; i < n -1; i++) {
            answer.add(answer.get(i) + answer.get(i-1));
        }
        return answer;
    }

    // 배열쓰지말아라 버젼
    public void solutionV2(int n) {

        int a = 1, b = 1, c = 0;
        System.out.print(a + " " + b + " ");
        for (int i = 1; i < n -1; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {

        피보나치수열04 ex = new 피보나치수열04();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

//        for (Integer x : ex.solutionV1(n)) {
//            System.out.print(x + " ");
//        };
        ex.solutionV2(n);
    }
}
