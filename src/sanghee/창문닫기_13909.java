package sanghee;

import java.util.Scanner;

public class 창문닫기_13909 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // 1~N까지 해당하는 숫자의 배수의 창문을 모두 닫은 후
        // 열려있는 창문 수를 세다 보면 최종적으로는 N의 제곱근이 나온다
        System.out.println((int)Math.sqrt(N));
    }
}
