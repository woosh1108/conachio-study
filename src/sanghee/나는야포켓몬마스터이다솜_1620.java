package sanghee;

import java.io.*;
import java.util.HashMap;

public class 나는야포켓몬마스터이다솜_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 도감의 개수 N과 문제의 개수 M 입력받기
        String input = br.readLine();
        String[] NM = input.split(" ");

        HashMap<String, Integer> pokemonMap = new HashMap<>(); // 포켓몬 이름을 key값으로 숫자를 값으로 설정
        String[] pokemonNames = new String[Integer.parseInt(NM[0])];

        // 도감의 내용 입력받기
        for(int i=0; i<Integer.parseInt(NM[0]); i++){
            String name = br.readLine();
            pokemonMap.put(name, i+1); // 포켓몬 이름을 key로, index+1을 value로 저장
            pokemonNames[i] = name;
        }

        for(int i=0; i<Integer.parseInt(NM[1]); i++){
            String target = br.readLine(); // 문제 입력받기

            // 만약 숫자를 입력받았다면 해당하는 index에 위치한 이름을 출력
            if(Character.isDigit(target.charAt(0))) {
                int index = Integer.parseInt(target);
                bw.write(pokemonNames[index-1]+"\n");
            }
            // 아니라면 target과 동일한 이름을 가진 것의 숫자를 출력
            else {
                bw.write(pokemonMap.getOrDefault(target, -1) + "\n");
            }
        }

        br.close();
        bw.flush(); // 한 번에 출력
        bw.close();
    }
}
