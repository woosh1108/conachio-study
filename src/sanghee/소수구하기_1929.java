package sanghee;

import java.util.Scanner;

public class 소수구하기_1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        // 0 ~ N 까지의 숫자의 소수 여부를 저장할 배열 생성
        boolean[] prime = new boolean[N + 1];

        prime[0] = prime[1] = true; // 0과 1은 소수가 아니므로 true로 초기회

        // 에라토스테네스의 체 알고리즘을 사용하여 소수 구하기
        // → 초기에 모든 수를 소수로 가정하고, 소수의 배수를 모두 제거하는 방식
        for(int i = 2; i <= Math.sqrt(prime.length); i++) { // 배열 길이의 제곱근까지가 소수를 판별하기 위한 최적의 범위
            for(int j = i * i; j < prime.length; j += i) { // 순차적으로 i 이외의 i의 배수를 제거
                prime[j] = true;
            }
            if(!prime[i]) {
                break;
            }
        }

        // prime 배열에서 M ~ N 까지의 소수 출력하기
        for(int i = M; i <= N; i++) {
            // false = 소수
            if(!prime[i]){
                System.out.println(i);
            }
        }

    }
}
