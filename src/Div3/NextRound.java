package Div3;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int k= in.nextInt();
        int numberOfParticipants=0;
        int[] num = new int[n];

        for(int i=0;i<n;i++){
            num[i]= in.nextInt();
        }

        for(int i=0;i<n;i++){
            if(num[i]>=num[k-1] && num[i]>0)
                numberOfParticipants++;
        }

        System.out.println(numberOfParticipants);
    }
}
