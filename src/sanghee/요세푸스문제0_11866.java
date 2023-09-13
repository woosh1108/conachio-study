package sanghee;

import java.util.*;

public class 요세푸스문제0_11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 전체 사람 수
        int K = sc.nextInt(); // 제거할 사람의 번호

        // 전체 사람의 수가 들어갈 Queue
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        StringBuilder result = new StringBuilder("<"); // 출력할 공간

        while (!queue.isEmpty()) {
            // K번째가 되기 전까지 넣고 제거해준다.
            for (int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }

            // K번째를 출력할 공간에 저장해준다.
            result.append(queue.poll());

            // queue가 전부 없어지기 전까지 ", "를 추가해준다.
            if (!queue.isEmpty()) {
                result.append(", ");
            }
        }

        result.append(">");

        // 출력
        System.out.println(result);
    }
}
