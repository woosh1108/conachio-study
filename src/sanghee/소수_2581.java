package sanghee;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class 소수_2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        boolean[] prime = new boolean[N + 1];

        prime[0] = prime[1] = true; // 0과 1은 소수가 아니므로 true로 저장

        // 아라토스테네스의 체 알고리즘
        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }


        List<Integer> dicimal = new LinkedList<>();
        int sum = 0;

        for(int i = M; i <= N; i++) {
            // false = 소수
            if(!prime[i]) {
                dicimal.add(i);
                sum+=i;
            }
        }

        if(dicimal.size()!=0){ // dicimal이 비어있지 않다면
            System.out.println(sum);
            System.out.println(dicimal.get(0));
        } else{ // dicimal이 비어있다면 -1 출력
            System.out.println("-1");
        }
    }
}
