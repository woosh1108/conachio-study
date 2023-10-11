package sanghee;

import java.util.Scanner;

public class 세탁소사장동혁_2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer(); // 출력할 내용을 저장할 공간

        int T = sc.nextInt(); // 테스트 케이스의 개수

        for(int i=0; i<T; i++){
            int C = sc.nextInt(); // 거스름돈 입력받기

            sb.append(C/25+" "); // 필요한 쿼터의 개수
            C%=25; // 쿼터를 뺀 나머지 돈
            sb.append(C/10+" "); // 필요한 다임의 개수
            C%=10; // 다임을 뺀 나머지 돈
            sb.append(C/5+" "); // 필요한 니켈의 개수
            C%=5; // 니켈을 뺀 나머지 돈
            sb.append(C/1+"\n"); // 필요한 페니의 개수
        }

        // 출력
        System.out.println(sb);
    }
}
