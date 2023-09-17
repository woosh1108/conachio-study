package sanghee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class 풍선터뜨리기_2346 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Balloon> balloons = new ArrayList<>(); // 풍선을 넣어줄 공간

        for (int i = 1; i <= N; i++) {
            int value = scanner.nextInt();
            balloons.add(new Balloon(i, value)); // 순번과 풍선 안에 들어있는 숫자를 넣어준다.
        }

        List<Integer> result = burstBalloons(balloons);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> burstBalloons(List<Balloon> balloons) {
        List<Integer> result = new ArrayList<>();
        int index = 0;

        while (!balloons.isEmpty()) {
            result.add(balloons.get(index).index); // 현재 풍선의 순서를 저장
            int move = balloons.get(index).value; // 종이에 적힌 값
            balloons.remove(index); // 풍선 제거

            if(!balloons.isEmpty()) {
                if (move > 0) {
                    index = (index + move - 1) % balloons.size(); // 오른쪽으로 이동
                } else {
                    index = (index + move) % balloons.size(); // 왼쪽으로 이동

                    if (index < 0) {
                        index += balloons.size(); // 음수일 경우 처리
                    }
                }
            }

        }

        return result;
    }

    static class Balloon {
        int index;
        int value;

        Balloon(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}