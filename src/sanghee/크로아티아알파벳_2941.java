package sanghee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 크로아티아알파벳_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 단어 입력받기
        String word = br.readLine();

        // 배열로 크로아티아 알파벳 넣어주기
        String[] target = {"c=", "c-","dz=","d-","lj","nj","s=","z="};

        // 반복문을 사용해 크로아티아 알파벳을 바꿔주기
        for(int i=0; i<target.length; i++){
            word = word.replace(target[i], "1");
        }

        // 출력
        System.out.println(word.length());
    }
}