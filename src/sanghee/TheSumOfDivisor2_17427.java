package sanghee;

import java.util.Scanner;

public class TheSumOfDivisor2_17427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long sum=0;
        for(int i=1; i<=N; i++){
           sum+=N/i*i;
        }

        System.out.println(sum);
    }
}
