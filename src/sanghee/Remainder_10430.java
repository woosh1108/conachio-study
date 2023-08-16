package sanghee;

import java.util.Scanner;

public class Remainder_10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[3];

        for(int i=0; i<3; i++){
            num[i]=sc.nextInt();
            if(num[i]<2 || num[i]>10000){
                return;
            }
        }

        int A = num[0], B = num[1], C = num[2];

        System.out.println((A+B)%C);
        System.out.println(((A%C)+(B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);

    }
}
