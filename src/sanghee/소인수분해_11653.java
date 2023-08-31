package sanghee;

import java.util.*;

public class 소인수분해_11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(N!=1){ // N이 1이 아니면 출력이 되지 않게
            List<Integer> list = new ArrayList<>();
            for(int i = 2; i<=Math.sqrt(N); i++) { // 제곱근 알고리즘
                if (N % i == 0) {
                    list.add(i);
                    N = N/i;
                    i = 1; // for문 직전에 i에 1을 더해주니 2가 아닌 1로 초기화
                }
            }
            list.add(N);
            Collections.sort(list);

            // 출력
            for(int i=0; i<list.size(); i++){
                System.out.println(list.get(i));
            }
        }

    }
}
