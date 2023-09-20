package sanghee;

import java.util.Scanner;

public class 수학은체육과목입니다_15894 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 공식은 n*4
        // n의 최대값인 10의 9승을 4와 곲하면 int의 최대값을 넘어가므로 long으로 형 변환
        System.out.println((long)n*4);
    }
}