package Div3;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args){

        Scanner in =new Scanner(System.in);
        long location=0;

        long x= in.nextLong();
        int steps=0;

        while (location < x){
            steps++;
            location+=5;
        }

        System.out.println(steps);
    }
}
