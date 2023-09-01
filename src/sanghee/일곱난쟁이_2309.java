package sanghee;

import java.util.Arrays;
import java.util.Scanner;

public class 일곱난쟁이_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 난쟁이 키 입력받기
        int[] N = new int[9];
        int sum=0;
        for(int i=0; i<9; i++){
            N[i] = sc.nextInt();
            sum+=N[i];
        }

        // 오름차순으로 출력하기 위해 정렬해준다.
        Arrays.sort(N);

        // 총 합에서 난쟁이 2개를 빼서 100이 되는 것을 찾는다.
        int spy1=0, spy2=0;
        for (int i = 0; i < N.length - 1; i++) {
            for (int j = i + 1; j < N.length; j++) {
                if (sum - N[i] - N[j] == 100) { // 만약 100이면 스파이들을 저장해준다.
                    spy1 = i;
                    spy2 = j;
                    break;
                }
            }
        }

        // 배열을 돌며 스파이 난쟁이가 아닌 것들을 제외하고 출력해준다.
        for (int i = 0; i < N.length; i++) {
            if (i != spy1 & i != spy2) {
                System.out.println(N[i]);
            }
        }

    }
}
