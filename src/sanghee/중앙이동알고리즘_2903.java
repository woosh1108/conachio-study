package sanghee;

import java.util.Scanner;

public class 중앙이동알고리즘_2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 점을 몇 번 추가할 건지 입력받기
        int N = sc.nextInt();

        // 몇 번을 추가하면 점이 몇 개인지 저장한다.
        int[] dot = new int[16];
        dot[0] = 4;

        for(int i=1; i<16; i++){
            double x = Math.sqrt(dot[i-1]); // 이전 점의 개수의 제곱근 x
            dot[i] = (int)Math.pow(x+x-1,2); // (x+x-1)의 제곱
        }

        // 출력
        System.out.println(dot[N]);
    }
}
