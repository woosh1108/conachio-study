package sanghee;

import java.util.Scanner;

public class 날짜계산_1476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();

        if(E==15){
            E=0;
        }
        if(S==28){
            S=0;
        }
        if(M==19){
            M=0;
        }

        int year = 0;
        for(int i=1; i<=Integer.MAX_VALUE; i++){
            if(i%15==E & i%28==S & i%19==M) {
                year = i;
                System.out.println(i);
                break;
            }
        }
    }
}
