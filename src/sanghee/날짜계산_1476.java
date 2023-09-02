package sanghee;

import java.util.Scanner;

public class 날짜계산_1476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();

        // 만약 입력받은 값이 최대 범의의 값이라면 0으로 초기화
        if (E == 15) {
            E = 0;
        }
        if (S == 28) {
            S = 0;
        }
        if (M == 19) {
            M = 0;
        }

        int year = 0; // 우리가 알고 있는 년도
        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            // 만약 최대 범위의 값으로 나눴을 때 E, S, M의 값과 동일하면 i를 출력하고 종료한다.
            if (i % 15 == E & i % 28 == S & i % 19 == M) {
                year = i;
                System.out.println(i);
                break;
            }
        }
    }
}