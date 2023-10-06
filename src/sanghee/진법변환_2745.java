package sanghee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 진법변환_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N과 B를 입력받기(B진법 수 N)
        String input = br.readLine();
        String[] input2 = input.split(" ");

        int num = 0; // 10진법으로 바꾼 값을 넣어줄 공간
        // N의 각 자리에 B의 제곱을 곱한 후 더한다.
        for(int i=0; i<input2[0].length(); i++){
            // N의 각 자리를 숫자로 변환한다.
            int x=0;
            try{
                x = Integer.parseInt(input2[0].charAt(input2[0].length()-1-i)+"");
            }catch (NumberFormatException e){
                // 만약 영문인 경우 아스키코드로 변환해 55를 빼준다.
                x = input2[0].charAt(input2[0].length()-1-i)-55;
            }

            // B의 제곱을 구한다.
            int y = Integer.parseInt(input2[1]);
            int z = (int)Math.pow(y, i);

            // 계산
            num += x*z;
        }

        // 출력
        System.out.println(num);
    }
}
