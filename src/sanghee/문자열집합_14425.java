package sanghee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class 문자열집합_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열의 개수 N과 검사해야 하는 문자열 M을 입력받는다.
        String input = br.readLine();
        String[] NM = input.split(" ");

        TreeSet<String> treeSet = new TreeSet<>(); // 문자열을 담을 공간
        int count = 0;

        // 문자열 입력받기
        for(int i=0; i<Integer.parseInt(NM[0]); i++){
            treeSet.add(br.readLine());
        }

        // 검사해야하는 문자열에 문자열이 몇 개가 포함되어있는지 검사한다.
        for(int i=0; i<Integer.parseInt(NM[1]); i++){
            String word = br.readLine(); // 검사해야 하는 문자열

            // 특정 키가 포함되어 있으면 true를 반환한다.
            if(treeSet.contains(word)){
                count++; // 개수 세기
            }
        }

        // 출력
        System.out.println(count);
    }
}