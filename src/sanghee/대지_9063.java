package sanghee;

import java.util.Arrays;
import java.util.Scanner;

public class 대지_9063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 입력받을 횟수

        int[] x = new int[N]; // x축의 값을 저장할 공간
        int[] y = new int[N]; // y축의 값을 저장할 공간

        // x와 y값을 각각 저장해주고 정렬해준다.
        for(int i=0; i<N; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        Arrays.sort(x);
        Arrays.sort(y);

        // 위의 점들이 포함되는 직사각형의 넓이를 구해준다.
        // (x의 최댓값-x의 최솟값) * (y의 최댓값-y의 최솟값)
        System.out.println((x[N-1]-x[0])*(y[N-1]-y[0]));
    }
}
