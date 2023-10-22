package sanghee;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class 대칭차집합_1269 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int aLength = sc.nextInt(); // 집합 A의 원소의 개수
        int bLength = sc.nextInt(); // 집합 B의 원소의 개수
        HashSet<Integer> set = new HashSet<>(); // 대칭차집합을 저장할 공간

        for (int i=0; i<aLength; i++){
            set.add(sc.nextInt()); // 집합 A의 원소 입력받기
        }

        // 집합 A와 집합 B의 대칭차입합 구하기
        for (int i=0; i<bLength; i++){
            int b = sc.nextInt(); // 집합 B의 원소 입력받기

            // 만약 집합 A에 집합 B의 원소가 이미 있다면 지워준다.
            if(set.contains(b)){
                set.remove(b);
            }
            // 아니라면 집합 B의 원소를 저장해준다.
            else{
                set.add(b);
            }
        }

        // 출력
        System.out.println(set.size());
    }
}
