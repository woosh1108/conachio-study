package sanghee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 회사에있는사람_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>(); // HashSet을 사용하면 시간복잡도를 줄일 수 있으며, 중복된 요소를 혀용하지 않는다.

        int n = Integer.parseInt(br.readLine()); // 로그에 기록된 출입 기록의 수 입력받기

        for(int i = 0; i<n; i++){
            String input = br.readLine(); // 로그에 기록된 출입 기록 입력받기
            String[] log = input.split(" ");

            // enter가 주어지면 해당하는 사람의 이름을 set에 저장한다.
            if(log[1].equals("enter")){
                set.add(log[0]);
            }
            // leave가 주어지면 해당하는 사람의 이름을 지운다.
            else{
                set.remove(log[0]);
            }
        }

        List<String> sortedList = new ArrayList<>(set); // 사전 역순으로 정렬하기 위해 복사하기
        Collections.sort(sortedList, Collections.reverseOrder()); // 사전 역순으로 정렬하기

        // 출력
        for(String name : sortedList){
            System.out.println(name);
        }
    }
}
