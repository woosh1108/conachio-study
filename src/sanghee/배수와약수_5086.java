package sanghee;

import java.util.Scanner;

public class 배수와약수_5086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int A = sc.nextInt();
            int B = sc.nextInt();

            // A와 B가 0을 입력받았다면 무한루프 깨기
            if(A==0 & B==0){
                break;
            }

            if(B%A==0) { // A가 B의 약수라면 factor 출력
                System.out.println("factor");
            } else if (A%B==0) { // A가 B의 배수라면 multiple 출력
                System.out.println("multiple");
            }else{ // 둘 다 아니라면 neither 출력
                System.out.println("neither");
            }
        }
    }
}
