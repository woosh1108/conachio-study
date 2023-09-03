package sanghee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 크로아티아알파벳_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine(); // 단어 입력받기

        String[] target = {"c=", "c-","dz=","d-","lj","nj","s=","z="}; // 배열로 크로아티아 알파벳 넣어주기

        // 반복문을 사용해 크로아티아 알파벳이 몇 개 들어있는지 세기
        for(int i=0; i<target.length; i++){
            croatianAlphabet(word, target[i]); // 크로아티아 알파벳이 몇 개 들어있는지 확인하기
            word = word.replace(target[i], "1"); // 확인한 크로아티아 알파벳을 바꿔주기
        }

        // 출력
        System.out.println(word.length());

    }
    public static void croatianAlphabet(String word, String target) {
        int position = word.indexOf(target); // 크로아티아 알파벳의 첫 위치

        // 여러 개의 크로아티아 알파벳 찾기
        while (position != -1) {
            position = word.indexOf(target, position + 1); // 다음 위치를 찾기 위해 이전 위치 이후부터 검색
        }
    }
}