package sanghee;

import java.util.Scanner;

public class 분수합_1735 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator1 = sc.nextInt(); // 분수의 분자1
        int denominator1 = sc.nextInt(); // 분수의 분모1
        int numerator2 = sc.nextInt(); // 분수의 분자2
        int denominator2 = sc.nextInt(); // 분수의 분모2

        // 두 분수를 통분하기
        int denominator = denominator1*denominator2/GCD(denominator1,denominator2);
        int numerator = (denominator/denominator1*numerator1)+(denominator/denominator2*numerator2);

        // 통분한 분수를 기약분수로 만들기
        int a = GCD(numerator,denominator);
        denominator = denominator/a;
        numerator = numerator/a;

        // 출력
        System.out.println(numerator+" "+denominator);

    }

    public static int GCD(int a, int b){ // 최대공약수를 구하는 메소드
        int c = a;
        int d = b;
        if(d>c){
            int e = c;
            c = d;
            d = e;
        }

        while(true){
            if(c%d==0){
                return d;
            }else{
                int e = c%d;
                c=d;
                d=e;
            }
        }
    }
}