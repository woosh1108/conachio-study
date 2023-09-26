package sanghee;

import java.util.Arrays;
import java.util.Scanner;

public class 세막대_14215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] length = new int[3];

        for(int i=0; i<3; i++){
            length[i] = sc.nextInt();
        }
        Arrays.sort(length);

        if(length[0]+length[1]>length[2]){
            System.out.println(length[0]+length[1]+length[2]);
        }else{
            int a = length[0]+length[1];
            System.out.println(a+a-1);
        }

    }
}
