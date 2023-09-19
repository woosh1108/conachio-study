package sanghee;

import java.util.Scanner;

public class 네번째점_3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] rectangle = new int[3][2]; // 점의 위치를 넣을 공간

        // 세 점의 좌표를 입력받기
        for(int i=0; i<3; i++){
            rectangle[i][0] = sc.nextInt();
            rectangle[i][1] = sc.nextInt();
        }

        // 네 번째 점의 x좌표 구하기 : 세 점 중 두 x과 다른 x 찾기
        int x=rectangle[0][0];
        if(rectangle[0][0]==rectangle[1][0]){
            x=rectangle[2][0];
        } else if (rectangle[0][0]==rectangle[2][0]) {
            x=rectangle[1][0];
        }

        // 네 번째 점의 y좌표 구하기 : 세 점 중 두 y과 다른 y 찾기
        int y=rectangle[0][1];
        if(rectangle[0][1]==rectangle[1][1]){
            y=rectangle[2][1];
        } else if (rectangle[0][1]==rectangle[2][1]) {
            y=rectangle[1][1];
        }

        System.out.println(x +" "+ y);
    }
}
