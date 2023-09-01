package sanghee;

import java.util.Scanner;

public class 최소공배수_1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 테스트 케이스 개수 입력받기
        int T = sc.nextInt();

        // 2. 테스트 케이스만큼 반복
        for(int i=0; i<T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = 0;
            int D = 0;

            // 3. A와 B 중 더 큰 수를 C에 넣어주기
            if(A>B){
                C = A;
                D = B;
            }else{
                C = B;
                D = A;
            }

            // 4. 유클리드 호제법을 사용하여 최대공약수 구하기
            // 유클리드 호제법, 연제법 : 소인수분해를 하지 않고 최대공약수를 구할 수 있는 방법
            while(true){
                if(C%D==0){ // 만약 C%D가 0이면 최소공배수 출력
                    System.out.println(A*B/D);
                    break;
                }else{
                    int E = C%D;
                    C=D;
                    D=E;
                }
            }

        }
    }
}
