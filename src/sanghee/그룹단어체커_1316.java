package sanghee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 그룹단어체커_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 단어 입력받기
        int N = Integer.parseInt(br.readLine());

        String[] word = new String[N];
        for(int i=0; i<N; i++){
            word[i] = br.readLine();
        }

        // 2. 그룹 단어의 개수 찾기
        int count = 0; // 그룹 단어가 아닌 단어의 개수
        int[] alphabet = new int[26]; // A-Z까지 세어줄 배열 생성

        for(int i=0; i<N; i++){
            Arrays.fill(alphabet, 0); // 단어가 들어있는 배열을 돌 때마다 0으로 초기화
            alphabet[(int)word[i].charAt(0)-97] = 1;
            for(int j=1; j<word[i].length(); j++){
                if(word[i].charAt(j)!=word[i].charAt(j-1) & alphabet[(int)word[i].charAt(j)-97] == 1){ // 이전 알파벳과 다르고 이전에 이미 사용한 알파벳이라면
                    count++; //
                    break;
                }
                alphabet[(int)word[i].charAt(j)-97] = 1;
            }
        }

        // 3. 출력
        System.out.println(N-count);

    }
}
