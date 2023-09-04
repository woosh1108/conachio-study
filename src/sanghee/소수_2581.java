package sanghee;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class 소수_2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        boolean[] prime = new boolean[N + 1]; // 0도 저장해야 하므로 +1 해준다.
        prime[0] = prime[1] = true; // 0과 1은 소수가 아니므로 true로 저장

        // 아라토스테네스의 체 알고리즘
        for(int i = 2; i <= Math.sqrt(prime.length); i++) { // 2부터 제곱근까지 돌며 i를 제외한 i의 배수 제거하기
            if(prime[i]) { // 이미 제거한 숫자일 경우 넘어가기
                continue;
            }
            for(int j = i * i; j < prime.length; j += i) { // i의 배수 제거하기
                prime[j] = true;
            }
        }

        List<Integer> dicimal = new LinkedList<>(); // 소수를 넣어줄 동적 리스트
        int sum = 0; // 소수들의 합

        // M부터 N까지의 소수 구하기
        for(int i = M; i <= N; i++) {
            // false일 때 소수
            if(!prime[i]) {
                dicimal.add(i);
                sum+=i;
            }
        }

        if(dicimal.size()!=0){ // dicimal이 비어있지 않다면 소수의 합과 소수들의 최솟값 출력
            System.out.println(sum);
            System.out.println(dicimal.get(0));
        } else{ // dicimal이 비어있다면 -1 출력
            System.out.println("-1");
        }
    }
}