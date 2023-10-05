package sanghee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 나이순정렬_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 회원의 수 입력받기
        int N = Integer.parseInt(br.readLine());

        // 회원의 나이와 이름을 입력받기
        String[][] users = new String[N][2];
        for(int i=0; i<N; i++){
            String input = br.readLine();
            String[] user = input.split(" ");
            users[i][0] = user[0];
            users[i][1] = user[1];
        }

        // 나이 순으로 정렬하고, 나이가 같으면 가입한 순으로 정렬하기
        Arrays.sort(users, (a, b) -> Integer.compare(Integer.parseInt(a[0]), Integer.parseInt(b[0])));

        // 출력
        for(int i=0; i<N; i++){
            System.out.println(users[i][0]+" "+users[i][1]);
        }
    }
}
