package array;

import java.util.Scanner;

public class 임시반장11 {

    // 나는 실패 - 다시 푸세요
    public int solutionV1(int n, int[][] arr) {

        int answer = 0;
        int sum1 = 0;
        int key1 = 0;

        for (int i = 1; i < n + 1; i++) {
            for(int j = 1; j < n + 1; j++){

                if (arr[i][0] == arr[j][0]) {
                    sum1++;
                }
                // z는 학년은 나타내기떄문에 5로 고정이다.
                for (int z = 0; z < n; z++) {

                }
                key1 = Math.max(key1, sum1);
                sum1 = 0;

            }
        }

        return answer = key1;
    }

    // 답안
    public int solutionV2(int n, int[][] arr) {

        int answer = 0;
        int max = 0;

        // i 는 학생
        // <=
        for (int i = 1; i <= n ; i++) {
            int cnt = 0;
            // j는 다른학생 조회
            // <=
            for(int j = 1; j <= n; j++){
                if (1 != j) {
                    // z는 학년은 나타내기떄문에 5로 고정이다.
                    // <=
                    for (int z = 1; z <= 5; z++) {
                        // 11=11/12=12/13=13/14=14
                        // 11=21/12=22/13=23/14=24
                        // 11=31/12=32/13=33/14=34
                        if (arr[i][z] == arr[j][z]) {
                            cnt++;
                            break;
                        }
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        임시반장11 ex = new 임시반장11();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        // 한칸 띄우기때문에 n+1 / 5학년까지니깐 6
        int[][] arr = new int[n+1][6];

        // <=
        for (int i = 1; i <= n ; i++) {
            // <=
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(ex.solutionV2(n, arr));

    }
}

