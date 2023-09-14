package sanghee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class 덱2_28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 명령어의 수
        StringBuffer sb = new StringBuffer(); // 출력 내용
        Deque<String> deque = new ArrayDeque<>(); // 명령어를 이행할 Deque

        for(int i=0; i<N; i++){
            // 명령어를 입력받아 공백 단위로 분리한다.
            String input = br.readLine();
            String[] tokens = input.split(" ");

            switch (tokens[0]){
                case "1": // 정수 X를 덱의 앞에 넣는다.
                    deque.offerFirst(tokens[1]);
                    break;
                case "2": // 정수 X를 덱의 뒤에 넣는다.
                    deque.offer(tokens[1]);
                    break;
                case "3": // 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
                    sb.append(!deque.isEmpty()?deque.poll():"-1").append("\n");
                    break;
                case "4": // 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
                    sb.append(!deque.isEmpty()?deque.pollLast():"-1").append("\n");
                    break;
                case "5": // 덱에 들어있는 정수의 개수를 출력한다.
                    sb.append(deque.size()).append("\n");
                    break;
                case "6": // 덱이 비어있으면 1, 아니면 0을 출력한다.
                    sb.append(deque.isEmpty()?"1":"0").append("\n");
                    break;
                case "7": // 덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없다면 -1을 대신 출력한다.
                    sb.append(!deque.isEmpty()?deque.peek():"-1").append("\n");
                    break;
                case "8": // 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없다면 -1을 대신 출력한다.
                    sb.append(!deque.isEmpty()?deque.peekLast():"-1").append("\n");
                    break;
            }
        }

        // 출력
        System.out.print(sb);
    }
}
