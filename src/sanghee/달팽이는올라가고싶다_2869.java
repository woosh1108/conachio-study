package sanghee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 달팽이는올라가고싶다_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 낮에 올라갈 A미터, 밤에 자는 동안 미끄러질 B미터, 올라야 하는 V미터를 차례대로 입력받기
        String input = br.readLine();
        String[] ABV = input.split(" ");

        int day = 0; // 나무 막대를 모두 올라가는데 걸리는 기간

        int v = Integer.parseInt(ABV[2])-Integer.parseInt(ABV[0]); // 올라갈 거리
        int c = Integer.parseInt(ABV[0])-Integer.parseInt(ABV[1]); // 반복되서 올라갈 수 있는 거리

        // 나머지가 0이면 몫에 1을 더한 값을 저장해준다.
        if(v%c==0){
            day = v/c+1;
        }
        // 나머지가 0이 아니라면 몫에 2를 더한 값을 저장해준다.
        else{
            day = v/c+2;
        }

        // 출력
        System.out.println(day);
    }
}
