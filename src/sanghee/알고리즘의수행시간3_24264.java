package sanghee;

import java.util.Scanner;

public class 알고리즘의수행시간3_24264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n의 제곱의 최댓값은 int의 최댓값을 넘어가므로 long으로 설정
        Long n = sc.nextLong(); // 입력의 크기 n 입력받기

        System.out.println(n*n); // 코드1의 수행 횟수
        System.out.println(2); // 코드1의 수행 횟수의 최고차항의 차수
    }
}
