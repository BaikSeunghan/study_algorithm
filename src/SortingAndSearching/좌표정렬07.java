package SortingAndSearching;

import java.util.*;

public class 좌표정렬07 {

    // 좌표정렬 문제는 풀때 이런식으로
    static class Point implements Comparable<Point> {
        public int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            // 이거는 외워서 하는 부분
            if (this.x == o.x) {
                // 항상 this 객체가 앞, o가 뒤에 있다고 생각하면서 접근한다.
                // 오름차순이라면 10-20이니까
                // 결과값이 음수값이 리턴이 되도록
                // 내림차순이라면 음수값이 리턴되야하니까
                // o.y - this.y;
                return this.y - o.y;
            } else {
                // 내림차순이라면 음수값이 리턴되야하니까
                // o.x - this.x;
                return this.x - o.x;
            }

        }
    }

    public static void main(String[] args) {

        좌표정렬07 ex = new 좌표정렬07();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            arr.add(new Point(x, y));
        }

        // 정렬 시키기
        // 정렬의 기준은 compareTo 메서드
        Collections.sort(arr);

        for (Point point : arr) {
            System.out.println(point.x + " " + point.y);

        }
    }
}