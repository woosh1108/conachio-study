package sanghee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 큐2_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 명령어를 입력받을 개수
        int N = Integer.parseInt(br.readLine());

        Deque<String> queue = new ArrayDeque<>(); // 숫자를 저장할 Queue
        StringBuilder output = new StringBuilder(); // 출력할 내용

        for(int i=0; i<N; i++){
            // 명령어를 입력받아 공백 단위로 배열로 저장하기
            String input = br.readLine();
            String[] tokens = input.split(" ");

            switch (tokens[0]){
                case "push": // 입력받은 정수를 큐에 넣기
                    queue.offer(tokens[1]);
                    break;
                case "pop": // 큐에서 가장 앞에 있는 정수를 빼고 그 수를 출력한다. 큐가 비어있다면 -1을 출력한다.
                    if(!queue.isEmpty()){
                        output.append(queue.poll()+"\n");
                    }else {
                        output.append("-1\n");
                    }
                    break;
                case "size": // 큐에 들어있는 정수의 개수를 출력한다.
                    output.append(queue.size()+"\n");
                    break;
                case "empty": // 큐가 비어있으면 1, 아니면 0을 출력한다.
                    if(queue.isEmpty()){
                        output.append("1\n");
                    }else {
                        output.append("0\n");
                    }
                    break;
                case "front": // 큐의 가장 앞에 있는 정수를 출력한다. 큐가 비어있으면 -1을 출력한다.
                    if(!queue.isEmpty()){
                        output.append(queue.peek()+"\n");
                    }else {
                        output.append("-1\n");
                    }
                    break;
                case "back": // 큐의 가장 뒤에 있는 정수를 출력한다. 큐가 비어있으면 -1을 출력한다.
                    if(!queue.isEmpty()){
                        output.append(queue.peekLast()+"\n");
                    }else {
                        output.append("-1\n");
                    }
                    break;

            }
        }

        // 한꺼번에 출력하기
        System.out.print(output);
    }
}
