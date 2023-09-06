package sanghee;

import java.util.Arrays;
import java.util.Scanner;

public class 평균_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 시험을 본 과목의 개수 N
        int N = sc.nextInt();

        // 현재 성적을 배열로 저장하기
        int[] score = new int[N];
        for(int i=0; i<N; i++){
            score[i] = sc.nextInt();
        }
        Arrays.sort(score); // 정렬
        double M = score[N-1]; // 성적의 최댓값

        double[] avg = new double[N]; // 고친 점수를 저장해줄 배열
        double sum = 0; // 고친 점수의 합

        // 모든 점수를 점수/M*100으로 고치기
        for(int i=0; i<N; i++){
            avg[i]=score[i]/M*100;
            sum += avg[i];
        }

        // 새로운 평균 출력
        System.out.println(sum/N);

    }
}
