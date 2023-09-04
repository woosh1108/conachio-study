package sanghee;

import java.util.Scanner;

public class 최소공배수_13241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 큰 수 입력을 위해 long으로 입력받기
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = A;
        long D = B;

        // 더 큰 수를 C에 넣어주기
        if(D>C){
            C=B;
            D=A;
        }

        // 유클리드 호제법 사용
        while(true){
            if(C%D==0){ // 0으로 나눠떨어질 때 최대공약수인 D를 구해 최대공약수 출력
                System.out.println(A*B/D);
                break;
            }else{
                long E = C%D;
                C = D;
                D = E;
            }
        }
    }
}
