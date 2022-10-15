package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 씨름선수01 {

    public static class Spec implements Comparable<Spec> {
        int h, w;

        public Spec(int h, int w) {
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Spec o) {
            // 내림차순 정렬
            return o.h - this.h;
        }
    }

    public int solutionV1(List<Spec> specs) {

        int answer = 0;
        Collections.sort(specs);
        int max = 0;

        for (Spec spec : specs) {
            // 몸무게 최대값만 비교
            if (spec.w > max) {
                max = spec.w;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        씨름선수01 ex = new 씨름선수01();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Spec> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            list.add(new Spec(h, w));
        }

        System.out.println(ex.solutionV1(list));
    }
}
