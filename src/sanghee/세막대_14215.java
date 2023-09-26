package sanghee;

import java.util.Arrays;
import java.util.Scanner;

public class 세막대_14215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 세 변의 길이를 입력받아 정렬해준다.
        int[] length = new int[3];
        for(int i=0; i<3; i++){
            length[i] = sc.nextInt();
        }
        Arrays.sort(length);

        // 만약 가장 긴 변보다 나머지 변의 합이 크다면 둘레의 길이를 출력해준다.
        if(length[0]+length[1]>length[2]){
            System.out.println(length[0]+length[1]+length[2]);
        }
        // 그렇지 않다면 가장 긴 변을 줄여서 둘레의 길이를 출력해준다.
        else{
            int a = length[0]+length[1];
            System.out.println(a+a-1);
        }

    }
}
