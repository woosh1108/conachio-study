package sanghee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 소트인사이드_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer(); // 출력할 내용을 저장할 공간

        String N = br.readLine(); // 정렬하려고 하는 수
        int[] num = new int[N.length()]; // 정렬한 수를 저장할 공간

        // 정렬하려고 하는 수를 배열에 저장하기
        for(int i=0; i<N.length(); i++){
            num[i] = Integer.parseInt(String.valueOf(N.charAt(i)));
        }

        // 배열을 오름차순으로 저장하기
        Arrays.sort(num);

        // 배열을 뒤에서부터 하나씩 꺼내 저장하기
        for(int i=num.length-1; i>=0; i--){
            sb.append(num[i]);
        }

        // 출력
        System.out.print(sb);
    }
}