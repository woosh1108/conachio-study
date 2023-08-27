package sanghee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어공부_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 단어 입력받기
        String word = br.readLine();
        word = word.toUpperCase(); // 단어 대문자로 바꿔주기

        // 2. 알파벳 개수 세기
        int[] alphabet = new int[26]; // A-Z까지 세어줄 배열 생성

        for(int i=0; i<word.length(); i++){ // 입력받은 단어를 해당하는 알파벳의 배열에 추가
            alphabet[(int)word.charAt(i)-65]++;
        }

        // 3. 가장 많이 적은 알파벳 구하기
        int count1 = 0;
        int count2 = 0;
        char maxAlphabet = ' ';
        for(int i=0; i<26; i++){
            if(alphabet[i]> count1){ // count1보다 알파벳 사용 횟수가 많다면 count1에 알파벳 사용 횟수 넣기
                count1 = alphabet[i];
                maxAlphabet = (char)(i+65);
            }else if(alphabet[i]== count1){ // count1과 알파벳 사용 횟수가 같다면 count2에 쓴 만큼의 숫자 넣기
                count2 = alphabet[i];
            }
        }

        // 4. 출력
        if(count1 == count2){ // 만약 count1과 count2가 같다면 ? 출력
            System.out.println("?");
        }else{
            System.out.println(maxAlphabet);
        }


    }
}
