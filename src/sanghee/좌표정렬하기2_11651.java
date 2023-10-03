package sanghee;

import java.util.Arrays;
import java.util.Scanner;

public class 좌표정렬하기2_11651 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 점의 개수 입력받기
        int N = sc.nextInt();

        // 점의 위치 x좌표와 y좌표를 입력받는다.
        int[][] xy = new int[N][2];
        for(int i=0; i<N; i++){
            xy[i][0] = sc.nextInt();
            xy[i][1] = sc.nextInt();
        }

        // 정렬한다.
        Arrays.sort(xy, (a, b) -> {
            // y좌표가 같으면 x좌표 순으로 정렬한다.
            if(a[1]==b[1]){
                return Integer.compare(a[0], b[0]);
            }
            // 그렇지 않다면 y좌표 순으로 정렬한다.
            else {
                return Integer.compare(a[1], b[1]);
            }
        });

        // 출력
        for(int i=0; i<N; i++){
            System.out.println(xy[i][0]+" "+xy[i][1]);
        }
    }
}