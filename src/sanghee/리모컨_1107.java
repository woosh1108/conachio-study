package sanghee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 리모컨_1107 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 이동하려는 채널 N
        int N = Integer.parseInt(br.readLine());

        // 고장난 버튼의 개수 M
        int M = Integer.parseInt(br.readLine());

        // 고장난 버튼을 저장하는 배열
        boolean[] isBroken = new boolean[10];

        // 고장난 버튼을 true로 저장해주기
        if (M > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                int brokenButton = Integer.parseInt(st.nextToken());
                isBroken[brokenButton] = true;
            }
        }

        // 초기값은 100번에서 시작
        int currentChannel = 100;
        int result = Math.abs(currentChannel - N); // 초기값으로 + 또는 - 버튼만을 사용하는 경우

        // 0부터 1,000,000까지 순회하면서 최소 횟수 계산
        for (int channel = 0; channel <= 1000000; channel++) {
            if (isPossible(channel, isBroken)) { // 만약 고장난 버튼이 없으면
                int press = Math.abs(channel - N) + getPressCount(channel);
                result = Math.min(result, press);
            }
        }

        System.out.println(result);
    }

    // 고장난 버튼을 사용할 수 있는지 확인하는 함수
    private static boolean isPossible(int channel, boolean[] isBroken) {
        if (channel == 0) { //
            return !isBroken[0];
        }

        while (channel > 0) {
            int digit = channel % 10; // 채널의 마지막 숫자 추출하여 digit에 저장
            if (isBroken[digit]) { // 현재 숫자가 망가진 숫자인지 검사
                return false;
            }
            channel /= 10; // 다음 자리로 이동
        }

        return true; // 모든 자리를 검사했으면 이동가능한 채널로 판단하고 true를 반환
    }

    // 채널로 이동하기 위해 눌러야 하는 버튼 횟수를 계산하는 함수
    private static int getPressCount(int channel) {
        if (channel == 0) {
            return 1;
        }

        int count = 0; // 버튼을 누른 횟수
        while (channel > 0) {
            count++;
            channel /= 10; // 다음 자리로 이동
        }

        return count;
    }
}