package sanghee;

import java.util.Arrays;
import java.util.Scanner;

public class Divisor_1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if(N<1 | N>50){
            return;
        }

        int[] M = new int[N];
        for(int i=0; i<N; i++){
            M[i] = sc.nextInt();
            if(M[i]<2 | M[i]>1000000){
                return;
            }
            for(int j=0; j<i; j++){
                if(M[i]==M[j]){
                    return;
                }
            }
        }

        Arrays.sort(M);

        System.out.println(M[0]*M[N-1]);
    }
}