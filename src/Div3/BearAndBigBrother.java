package Div3;

import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int x= in.nextInt();
        int y= in.nextInt();

        int numOfYears=0;

        while (x<=y){
            numOfYears++;
            x*=3;
            y*=2;
        }

        System.out.println(numOfYears);
    }
}
