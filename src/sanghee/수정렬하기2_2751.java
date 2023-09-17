package sanghee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 수정렬하기2_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer(); // 출력할 내용을 저장할 공간

        int N = Integer.parseInt(br.readLine()); // 명령의 수
        int[] num = new int[N];

        // 명령의 수만큼 숫자 입력받기
        for(int i=0; i<N; i++){
            num[i] = Integer.parseInt(br.readLine());
        }

        // 입력받은 숫자 오름차순으로 정렬하기
        Arrays.sort(num);

        // 오름차순으로 정렬한 숫자를 sb에 저장하기
        for(int i=0; i<N; i++){
            sb.append(num[i]).append("\n");
        }

        // 출력
        System.out.print(sb);
    }
}
