package sanghee;

import java.util.Arrays;
import java.util.Scanner;

public class 숫자카드_10815 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        // 자신의 카드를 입력받고 정렬해준다.
        int N = sc.nextInt();
        int[] myCard = new int[N];

        for(int i=0; i<N; i++){
            myCard[i] = sc.nextInt();
        }
        Arrays.sort(myCard);

        // 숫자 카드에 자신이 가지고 있는 카드인지 비교한다.
        int M = sc.nextInt();
        for(int i=0; i<M; i++){
            int card = sc.nextInt();

            if(binarySearch(myCard, card)){
                sb.append(1+" ");
            }else{
                sb.append(0+" ");
            }
        }

        // 출력
        System.out.println(sb);
    }

    // 이분 탐색 함수
    public static boolean binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length -1;

        while(left <= right){
            int mid = (left + right) / 2; // 배열의 중간값

            // 찾으면 true 반환
            if(arr[mid] == target){
                return true;
            }
            // target이 중간값보다 크면 left를 중간값+1 할당
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            // target이 중간값보다 작으면 left를 중간값-1 할당
            else{
                right = mid - 1;
            }
        }

        // 못 찾았으면 false 반환
        return false;
    }
}
