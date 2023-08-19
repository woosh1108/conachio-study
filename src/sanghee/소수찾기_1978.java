package sanghee;

import java.util.Scanner;

public class 소수찾기_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] M=new int[N];
        for (int i = 0; i < N; i++) {
            M[i]=sc.nextInt();
        }

        int count =0;
        for(int i=0; i<N; i++){
            int decimal = 0;
            for(int j=1; j<=M[i]; j++){
                if(M[i]%j==0){
                    decimal++;
                }
            }
            if(decimal==2){
                count++;
            }
        }

        System.out.println(count);
    }
}
