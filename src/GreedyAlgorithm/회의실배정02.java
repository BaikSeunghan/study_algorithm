package GreedyAlgorithm;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 회의실배정02 {

    public static class Room implements Comparable<Room> {
        int start, end;

        public Room(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Room o) {
            if (this.end == o.end) {
                return this.start - o.start;
            } else {
                return this.end - o.end;
            }
        }
    }

    public int solutionV1(List<Room> arr) {

        int answer = 0;
        Collections.sort(arr);

        // 회의시간은 0시부터 시작한다.
        int et = 0;

        for (Room room : arr) {
            // 회의의 시작시간과 끝나는 시간의 조건은 (시작시간 <= 끝나는 시간)
            if (room.start >= et) {
                answer++;
                et = room.end;
            }
        }

        return answer;

    }

    public static void main(String[] args) {

        회의실배정02 ex = new 회의실배정02();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Room> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            list.add(new Room(start, end));
        }

        System.out.println(ex.solutionV1(list));
    }

}