package sanghee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class 단어정렬_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // HashSet은 중복된 문자열을 효과적으로 제거해준다.
        HashSet<String> wordsSet = new HashSet<>();
        for(int i=0; i<N; i++){
            wordsSet.add(br.readLine());
        }

        // 리스트에 중복된 문자열을 제거한 단어들을 넣어준다.
        ArrayList<String> words = new ArrayList<>(wordsSet);

        // 메소드와 람다표현식을 사용하여 정렬하기
        Collections.sort(words, (a, b) -> {
            // 두 문자열의 길이가 같다면 두 문자열을 사전 순으로 비교하여 정렬한다.
            if(a.length() == b.length()){
                return a.compareTo(b);
            }
            // 그렇지 않다면 두 문자열을 길이 순으로 비교하여 정렬한다.
            else{
                return Integer.compare(a.length(), b.length());
            }
        });

        // 출력
        for(String word : words){
            System.out.println(word);
        }
    }
}