package sanghee;

import java.util.Scanner;

public class 삼각형외우기_10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 삼각형의 각의 크기를 입력받는다.
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a==60 & b==60 & c==60){ // 세 각의 크기가 모두 60이면 Equilateral 출력
            System.out.println("Equilateral");
        } else if (a+b+c==180) { // 세 각의 합이 180이고,
            if(a==b | b==c | c==a){ // 두 각이 같은 경우에는 Isosceles 출력
                System.out.println("Isosceles");
            }else{ // 같은 각이 없는 경우에는 Scalene 출력
                System.out.println("Scalene");
            }
        }else{ // 세 각의 합이 180이 아닌 경우에는 Error 출력
            System.out.println("Error");
        }
    }
}
