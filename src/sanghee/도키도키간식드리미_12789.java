package sanghee;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class 도키도키간식드리미_12789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> deque = new ArrayDeque<>();
        String output = "Nice";

        for(int i=0; i<N; i++) {
            stack.offer(sc.nextInt());
        }

        for(int i=1; i<=N; i++){
            if(!deque.isEmpty()){
                if(deque.peekLast()==i){
                    deque.pollLast();
                    continue; // 다음 루프로 이동
                }
            }
            while(true){
                if(!stack.isEmpty()) {
                    if(stack.peek()==i){
                        stack.poll();
                        break;
                    }else {
                        deque.offer(stack.poll());
                    }
                }else {
                    output = "Sad";
                    break;
                }
            }
            if(output.equals("Sad")){
                break;
            }
        }

        System.out.println(output);
    }
}
