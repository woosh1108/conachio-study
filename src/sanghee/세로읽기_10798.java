package sanghee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 세로읽기_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 단어 입력받기
        char[][] alphabet = new char[5][15]; // 5개 단어의 알파벳을 넣을 배열

        // 단어 입력받아 배열에 알파벳 하나씩 넣어주기
        for(int i=0; i<5; i++){
            String word = br.readLine();
            for(int j=0; j<word.length(); j++){
                alphabet[i][j] = word.charAt(j);
            }
        }

        // 2. 세로 읽기
        String verticalReading = "";
        for(int i=0; i<15; i++){
            for(int j=0; j<5; j++){
                verticalReading += alphabet[j][i]; // 배열에서 세로로 하나씩 빼주기
            }
        }

        // 3. 출력
        verticalReading = verticalReading.replaceAll("\\u0000",""); // 공백 제거
        System.out.println(verticalReading);

    }
}
