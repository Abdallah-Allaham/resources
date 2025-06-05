package algorithm.recursion;

import java.util.Scanner;

public class Summation {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A Number");
        System.out.println("The Summation is "+summation(in.nextInt()));
    }

    public static int summation(int num){
        if (num == 1)
            return 1;
        else
            return num+summation(num-1);
    }
}
