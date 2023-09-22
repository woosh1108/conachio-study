package sanghee;

import java.util.Scanner;

public class 삼각형과세변_5073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 세 변의 길이를 입력받는다.
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // 만약 세 변 모두가 0이면 while문을 종료한다.
            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            // 세 변의 길이가 삼각형의 조건을 만족하지 못하면 Invalid 출력
            if (a + b <= c || b + c <= a || c + a <= b) {
                System.out.println("Invalid");
            }
            // 세 변의 길이가 모두 같은 경우 Equilateral 출력
            else if (a == b && b == c) {
                System.out.println("Equilateral");
            }
            // 두 변의 길이만 같은 경우 Isosceles 출력
            else if (a == b || b == c || c == a) {
                System.out.println("Isosceles");
            }
            // 세 변의 길이가 모두 다른 경우 Scalene 출력
            else {
                System.out.println("Scalene");
            }
        }
    }
}