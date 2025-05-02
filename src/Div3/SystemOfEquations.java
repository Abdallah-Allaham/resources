package Div3;

import java.util.Scanner;

public class SystemOfEquations {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int m= in.nextInt();

        int count=0;

        for(int a=0;a<1001;a++){
            for (int b=0;b<1001;b++){
                if ( a*a + b == n && b*b + a == m)
                    count++;
            }
        }

        System.out.println(count);

    }
}
