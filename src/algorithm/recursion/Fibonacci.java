package algorithm.recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Fibonacci Method, Enter A Number");
        System.out.println(fibonacci(in.nextInt()));

    }

    public static int fibonacci(int num){
        if (num == 1 || num == 2) return 1;
        else {
            return fibonacci(num-1) + fibonacci(num-2);
        }
    }
}
