package sanghee;

import java.util.Scanner;

public class 분수찾기_1193 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // X 입력받기
        int X = scanner.nextInt();

        // 대각선 번호 구하기
        int diagonalNum = 1; // 대각선의 번호를 나타내는 변수
        // 입력받은 X값이 현재 대각선 번호보다 큰 동안 X에서 대각선 번호를 뺀 후 대각선 번호를 중가시킨다.
        while (X > diagonalNum) {
            X -= diagonalNum;
            diagonalNum++;
            System.out.println("X: "+X);
            System.out.println("diagonalNum: "+diagonalNum);
        }

        // 분자와 분모 구하기
        int numerator, denominator; // 분자와 분모를 저장할 변수
        // 대각선 번호가 홀수라면 분자가 대각선 번호에서 X를 뺀 값에 1을 더하고 분모는 X로 설정
        if (diagonalNum % 2 == 1) {
            numerator = diagonalNum - X + 1;
            denominator = X;
        }
        // 아니라면 분모가 대각선 번호에서 X를 뺀 값에 1을 더한다.
        else {
            numerator = X;
            denominator = diagonalNum - X + 1;
        }

        // 출력
        System.out.println(numerator + "/" + denominator);
    }
}
