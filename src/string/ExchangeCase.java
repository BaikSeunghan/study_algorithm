package string;

import java.util.Scanner;

public class ExchangeCase {

    public String solution(String str) {

        String answer = "";

        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        ExchangeCase exchangeCase = new ExchangeCase();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(exchangeCase.solution(str));
    }
}
