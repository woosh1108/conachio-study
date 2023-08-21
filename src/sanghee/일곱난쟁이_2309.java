package sanghee;

import java.util.Arrays;
import java.util.Scanner;

public class 일곱난쟁이_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] N = new int[9];
        int sum=0;
        for(int i=0; i<9; i++){
            N[i] = sc.nextInt();
            sum+=N[i];
        }
        Arrays.sort(N);

        int spy1=0, spy2=0;
        for (int i = 0; i < N.length - 1; i++) {
            for (int j = i + 1; j < N.length; j++) {
                if (sum - N[i] - N[j] == 100) {
                    spy1 = i;
                    spy2 = j;
                    break;
                }
            }
        }

        for (int i = 0; i < N.length; i++) {
            if (i != spy1 & i != spy2) {
                System.out.println(N[i]);
            }
        }

    }
}
