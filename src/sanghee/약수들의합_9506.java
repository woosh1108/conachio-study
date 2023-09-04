package sanghee;

import java.util.Scanner;

public class 약수들의합_9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        while(true){
            n = sc.nextInt();

            // -1을 입력받으면 while문 깨기
            if(n==-1){
                break;
            }

            PerfectNumber(n); // 완전수 구하기
        }
    }

    public static void PerfectNumber(int n){
        // 모든 수는 1을 약수를 가지므로 1을 저장해준다.
        String print = "1"; // 약수의 합
        int sum=1; // 출력할 내용

        // 입력받은 숫자를 제외한 약수를 구해 넣어준다.
        for(int i=2; i<n; i++){
            if(n%i==0){
                sum+=i;
                print+=" + "+i;
            }
        }

        // 입력받은 숫자가 1이 아니고 완전수일 때만 약수들을 출력해주고, 아닐 때는 완전수가 아니라고 출력해준다.
        if(sum==n & n!=1){
            System.out.println(n+" = "+print);
        }else{
            System.out.println(n+" is NOT perfect.");
        }
    }
}
