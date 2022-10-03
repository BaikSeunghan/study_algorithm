package string;

import java.util.Scanner;

public class FindChar01 {

    public int solution(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for (char x : str.toCharArray()) {
            if (x == c) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {

        FindChar01 findChar01 = new FindChar01();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        char c = scanner.next().charAt(0);

        System.out.println(findChar01.solution(str, c));
    }
}
