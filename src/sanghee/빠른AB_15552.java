package sanghee;

import java.io.*;

public class 빠른AB_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine()); // 테스트케이스의 개수 입력받기

        // A+B를 계산하기
        for(int i=0; i<T; i++){
            String input = br.readLine();
            String[] AB = input.split(" ");

            bw.write(Integer.parseInt(AB[0])+Integer.parseInt(AB[1])+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
