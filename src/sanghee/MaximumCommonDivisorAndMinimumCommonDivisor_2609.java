package sanghee;

import java.util.Scanner;

public class MaximumCommonDivisorAndMinimumCommonDivisor_2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int GCD=b;
        int LCM = a*b;
        while(true){
            GCD = a%b;
            if (GCD == 0) {
                break;
            }
            a=b;
            b=GCD;
        }
        GCD=b;
        LCM = LCM/GCD;

        System.out.println(GCD);
        System.out.println(LCM);


    }
}
