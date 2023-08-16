package sanghee;

import java.math.BigInteger;
import java.util.Scanner;

public class One_4375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int n = sc.nextInt();
            if(n<1 || n>10000 || n%2==0 || n%5==0){
                return;
            }

            int remainder = 0;

            for(int i=1; ; i++){
                remainder = (remainder*10+1)%n;
                if(remainder==0){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}