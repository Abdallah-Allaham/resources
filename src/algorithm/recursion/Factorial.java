package algorithm.recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Factorial Number, Enter A Number");
        System.out.println(factorial(in.nextInt()));

    }

    public static int factorial(int num){
        if (num == 1) return 1;
        else {
            return num * factorial(num-1);
        }
    }
}
