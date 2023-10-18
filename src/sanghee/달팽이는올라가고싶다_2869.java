package sanghee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 달팽이는올라가고싶다_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] ABV = input.split(" ");

        int day = 0;

        int v = Integer.parseInt(ABV[2])-Integer.parseInt(ABV[0]);
        int c = Integer.parseInt(ABV[0])-Integer.parseInt(ABV[1]);

        if(v%c==0){
            day = v/c+1;
        } else{
            day = v/c+2;
        }

        System.out.println(day);
    }
}
