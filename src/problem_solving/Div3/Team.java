package problem_solving.Div3;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numOfQuestion = in.nextInt();
        int sure=0;

        for(int i=0;i<numOfQuestion; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            int sum=x+y+z;
            if(sum > 1)
                sure++;
        }
        System.out.println(sure);
    }
}
