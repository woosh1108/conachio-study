package sanghee;

import java.util.Arrays;
import java.util.Scanner;

public class 좌표정렬하기_11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 점의 개수를 입력받기
        int N = sc.nextInt();

        // 점의 개수만큼 x와 y를 입력받기
        int[][] xy = new int[N][2];
        for(int i=0; i<N; i++){
            xy[i][0] = sc.nextInt();
            xy[i][1] = sc.nextInt();
        }

        // 람다식으로 2차원 배열 정렬하기
        Arrays.sort(xy, (a, b) -> {
            // 현재 행과 그 다음 행이 같은 경우 두 번째 요소의 순서로 정렬한다.
            if(a[0]==b[0]){
                return Integer.compare(a[1], b[1]);
            }
            // 그렇지 않으면 첫 번째 요소의 순서로 정렬한다.
            else{
                return Integer.compare(a[0], b[0]);
            }
        });

        // 출력
        for(int i=0; i<N; i++){
            System.out.println(xy[i][0]+" "+xy[i][1]);
        }
    }
}