package sanghee;

import java.util.Scanner;

public class 알고리즘의수행시간6_24267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 결과값이 int의 최댓값을 넘어가므로 long으로 설정
        long n = sc.nextInt();

        System.out.println(n*(n-1)*(n-2)/6); // 코드1의 수행 횟수
        System.out.println(3); // 코드1의 수행 횟수의 최고차항의 차수
    }
}
