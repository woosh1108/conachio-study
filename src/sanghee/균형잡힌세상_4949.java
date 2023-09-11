package sanghee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 균형잡힌세상_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Stack<String> write = new Stack<>(); // 문장을 입력받을 공간

        // 문장 입력받기
        while(true){
            String w = br.readLine();
            if(w.equals(".")){ // 만약 온점 하나만 입력받았다면 입력을 종료한다.
                break;
            }
            write.push(w); // 입력받은 것은 스택에 넣어준다.
        }

        for(int i=0; i<write.size(); i++){
            Stack<Character> stack = new Stack<>();
            for(int j=0; j<write.get(i).length(); j++){
                // 문자열이 (나 [로 되어있으면 스택에 넣어준다.
                if(write.get(i).charAt(j)=='(' | write.get(i).charAt(j)=='['){
                    stack.push(write.get(i).charAt(j));
                }
                // 문자열이 )일 때 이전 문자열이 (라면 이전 문자열을 빼준다.
                else if (write.get(i).charAt(j)==')') {
                    // 스택이 비어있다면 문자열 하나를 넣어주고 for문을 종료해준다.
                    if(stack.isEmpty()) {
                        stack.push('1');
                        break;
                    }
                    if(stack.peek()=='('){
                        stack.pop();
                    } else {
                        break;
                    }
                }
                // 문자열이 ]일 때 이전 문자열이 [라면 이전 문자열을 빼준다.
                else if (write.get(i).charAt(j)==']') {
                    // 스택이 비어있다면 문자열 하나를 넣어주고 for문을 종료해준다.
                    if(stack.isEmpty()) {
                        stack.push('1');
                        break;
                    }
                    if(stack.peek()=='['){
                        stack.pop();
                    } else {
                        break;
                    }
                }
            }

            // stack이 비어있지 않다면 yes를 출력해주고, 아니라면 no를 출력해준다.
            if(stack.isEmpty()) {
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }


    }
}
