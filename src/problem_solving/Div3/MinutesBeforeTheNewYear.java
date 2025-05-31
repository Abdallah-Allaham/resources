package problem_solving.Div3;

import java.util.Scanner;

public class MinutesBeforeTheNewYear {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCase= in.nextInt();

        int h=0,m=0;

        for(int i=0;i<testCase;i++){
            h= in.nextInt();
            m=in.nextInt();

            int numOfMinutes=((23-h)*60)+(60-m);
            System.out.println(numOfMinutes);
        }

    }
}
