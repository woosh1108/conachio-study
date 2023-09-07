package sanghee;

import java.util.Scanner;

public class 너의평점은_25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] score = new String[3][20];

        double credit = 0;
        double sum = 0;

        for(int i=0; i<20; i++){
            score[0][i] = sc.next();
            score[1][i] = sc.next();
            score[2][i] = sc.next();

            // 학점의 총합
            credit += Double.parseDouble(score[1][i]);

            // (학점 * 과목평점)의 합
            switch(score[2][i]){
                case "A+":
                    sum += Double.parseDouble(score[1][i])*4.5;
                    break;
                case "A0":
                    sum += Double.parseDouble(score[1][i])*4.0;
                    break;
                case "B+":
                    sum += Double.parseDouble(score[1][i])*3.5;
                    break;
                case "B0":
                    sum += Double.parseDouble(score[1][i])*3.0;
                    break;
                case "C+":
                    sum += Double.parseDouble(score[1][i])*2.5;
                    break;
                case "C0":
                    sum += Double.parseDouble(score[1][i])*2.0;
                    break;
                case "D+":
                    sum += Double.parseDouble(score[1][i])*1.5;
                    break;
                case "D0":
                    sum += Double.parseDouble(score[1][i])*1.0;
                    break;
                case "P": // P인 과목의 경우 계산에서 제외
                    credit -= Double.parseDouble(score[1][i]);
                    break;
            }
        }

        //  전공평점 출력
        System.out.println(sum/credit);
    }
}
