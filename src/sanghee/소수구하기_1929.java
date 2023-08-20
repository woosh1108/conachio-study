package sanghee;

import java.util.Scanner;

public class 소수구하기_1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        boolean[] prime = new boolean[N + 1];

        prime[0] = prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

        for(int i = M; i <= N; i++) {
            // false = 소수
            if(!prime[i]) System.out.println(i);
        }

    }
}
