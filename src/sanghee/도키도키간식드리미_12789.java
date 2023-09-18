package sanghee;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class 도키도키간식드리미_12789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Deque<Integer> line = new ArrayDeque<>(); // 현재 줄 서있는 곳
        Deque<Integer> defer = new ArrayDeque<>(); // 한 명씩만 설 수 있는 공간
        String output = "Nice"; // 무사히 간식을 받을 수 있는지

        // 현재 줄 서 있는 곳의 번호표를 나열해준다.
        for(int i=0; i<N; i++) {
            line.offer(sc.nextInt());
        }

        for(int i=1; i<=N; i++){
            // 만약 defer에 있는 번호표가 i와 같다면 꺼내고 다음 루프로 이동한다.
            if(!defer.isEmpty()){
                if(defer.peekLast()==i){
                    defer.pollLast();
                    continue; // 다음 루프로 이동
                }
            }
            while(true){
                if(!line.isEmpty()) {
                    // line에 있는 번호표가 일치하면 꺼내주고, 아니면 defer로 이동시켜준다.
                    if(line.peek()==i){
                        line.poll();
                        break;
                    }else {
                        defer.offer(line.poll());
                    }
                }
                // line에 사람이 없어질동안 찾지 못했다면 출력할 내용에 Sad를 넣어주고 while문을 깨준다.
                else {
                    output = "Sad";
                    break;
                }
            }
            // 만약 출력할 내용이 Sad라면 for문을 깨준다.
            if(output.equals("Sad")){
                break;
            }
        }

        // 출력
        System.out.println(output);
    }
}