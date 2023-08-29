package sanghee;

import java.util.Scanner;

public class 약수들의합_9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        while(true){
            n = sc.nextInt();

            if(n==-1){
                break;
            }

            PerfectNumber(n);
        }
    }

    public static void PerfectNumber(int n){
        String print = "1";
        int sum=1;
        for(int i=2; i<n; i++){
            if(n%i==0){
                sum+=i;
                print+=" + "+i;
            }
        }
        if(n==1){
            System.out.println(n+" is NOT perfect.");
        }else if(sum==n){
            System.out.println(n+" = "+print);
        }else{
            System.out.println(n+" is NOT perfect.");
        }
    }
}
