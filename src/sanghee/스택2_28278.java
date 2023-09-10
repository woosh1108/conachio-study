package sanghee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택2_28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 명령의 수
        Stack<Integer> stack = new Stack<>(); // 저장할 스택
        StringBuilder sb = new StringBuilder(); // 출력할 내용

        for(int i=0; i<N; i++){
            String input = br.readLine(); // 입력받기
            String[] tokens = input.split(" "); // 입력받아 공백 단위로 배열로 저장하기
            switch (Integer.parseInt(tokens[0])) { // sb에 출력할 내용을 저장하고 줄 바꿈 문자도 저장해준다.
                case 1: // 정수 X를 스택에 넣는다.
                    stack.push(Integer.parseInt(tokens[1]));
                    break;
                case 2: // 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
                    sb.append(!stack.isEmpty() ? stack.pop() : "-1").append('\n');
                    break;
                case 3: // 스택에 들어있는 정수의 개수를 출력한다.
                    sb.append(stack.size()).append('\n');;
                    break;
                case 4: // 스택이 비어있으면 1, 아니면 0을 출력한다.
                    sb.append(stack.isEmpty() ? "1" : "0").append('\n');;
                    break;
                case 5: // 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
                    sb.append(!stack.isEmpty() ? stack.peek() : "-1").append('\n');;
                    break;
            }
        }

        // 한꺼번에 출력하기
        System.out.println(sb);
    }
}