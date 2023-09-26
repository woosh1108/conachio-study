package sanghee;

import java.util.Scanner;

public class 직사각형에서탈출_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // x, y, w, h를 입력받아 준다.
        int x=sc.nextInt();
        int y=sc.nextInt();
        int w=sc.nextInt();
        int h=sc.nextInt();

        // 직사각형의 경계선까지 가는 거리의 최소값을 구해준다.
        int length = w-x;

        if(x<length){
            length = x;
        }
        if(y<length){
            length = y;
        }
        if(h-y<length){
            length = h-y;
        }

        // 출력
        System.out.println(length);
    }
}
