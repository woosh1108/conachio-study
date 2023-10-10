package sanghee;

import java.util.Scanner;

public class 진법변환2_11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder br = new StringBuilder();

        // N과 B를 입력받기(10진법 N을 B진법 수로 바꾸기)
        int N = sc.nextInt();
        int B = sc.nextInt();

        while(N>0){
            int remainder = N%B; // 나머지 구하기

            // 나머지가 9보다 크면 알파벳 대문자로 바꿔주고 문자에 넣어준다.
            if(remainder>9){
                char digit = (char) ('A' + remainder - 10);
                br.insert(0, digit); // insert를 사용하면 넣어줄 위치를 지정해준 수 있다.
            }
            // 아니라면 그냥 넣어준다.
            else{
                br.insert(0, remainder);
            }
            // N에 몫 넣어주기
            N = N/B;
        }

        // 출력
        System.out.println(br);
    }
}
