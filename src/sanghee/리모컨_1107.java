package sanghee;

import java.util.Scanner;

public class 리모컨_1107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        int M = sc.nextInt();
        int getBroken[] = new int[10];

        for(int i=0; i<M; i++){
            getBroken[sc.nextInt()] = -1;
        }

        if(N.equals("100"))
            System.out.println(0);
        else {
            int min = Integer.MAX_VALUE;
            String v = "";
            String closer = "";

            for (int i = 0; i < 1000000; i++) {
                boolean isOk = true;
                v = i + "";
                for (int j = 0; j < v.length(); j++) {
                    if (getBroken[v.charAt(j) - '0'] == -1) {
                        isOk = false;
                        break;
                    }
                }
                if (isOk) {
                    if (min > Math.abs(Integer.parseInt(N) - Integer.parseInt(v))) {
                        min = Math.abs(Integer.parseInt(N) - Integer.parseInt(v));
                        closer = v;
                    }
                }
            }

            int result1 = Math.abs(Integer.parseInt(N) - 100);
            if (closer.equals("")){
                System.out.println(result1);
            }
            else {
                int result2 = Math.abs(Integer.parseInt(N) - Integer.parseInt(closer)) + closer.length();
                if (result1 > result2){
                    System.out.println(result2);
                }
                else{
                    System.out.println(result1);
                }
            }
        }

    }
}
