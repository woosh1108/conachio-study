package sanghee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 제로_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine()); // 입력받을 수의 개수
        Stack<Integer> stack = new Stack<>(); // 입력받은 수를 저장할 스택

        for(int i=0; i<K; i++){
            int x = Integer.parseInt(br.readLine());

            // 만약 입력받은 수가 0이 아니면 stack에 저장해주고, 0이면 이 전의 수를 제거해준다.
            if(x!=0) {
                stack.push(x);
            }else {
                stack.pop();
            }
        }

        int sum = 0; // 최종적으로 적은 수의 합
        for(int i=0; i<stack.size(); i++){
            sum+= stack.get(i);
        }

        // 출력
        System.out.println(sum);
    }
}
