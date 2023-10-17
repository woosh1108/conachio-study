package sanghee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class 듣보잡_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 듣도 못한 사람의 수와 보도 못한 사람의 수를 입력받는다.
        String input = br.readLine();
        String[] NM = input.split(" ");

        HashSet<String> set = new HashSet<>();
        ArrayList<String> result = new ArrayList<>();

        // 듣도 못한 사람의 명단을 입력받는다.
        for(int i=0; i<Integer.parseInt(NM[0]); i++){
            set.add(br.readLine()); // 듣도 못한 사람의 이름
        }

        // 보도 못한 사람의 이름을 입력받아 듣도 보도 못한 사람의 명단을 구한다.
        for(int i=0; i<Integer.parseInt(NM[1]); i++){
            String name = br.readLine(); // 보도 못한 사람의 이름

            // 입력받은 name이 중복된다면 result에 저장해준다.
            if(set.contains(name)){
                result.add(name);
            }
        }
        Collections.sort(result); // 사전순으로 정렬해준다.

        // 출력
        System.out.println(result.size());
        for (String name : result) {
            System.out.println(name);
        }
    }
}