package string;

import java.util.Scanner;

public class ExchangeCase02 {

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

        ExchangeCase02 exchangeCase02 = new ExchangeCase02();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(exchangeCase02.solution(str));
    }
}
