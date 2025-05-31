package data_structure.stack_impl;

import java.util.Scanner;
import java.util.Stack;

public class TaskStack1 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> odd = new Stack<>();
        Stack<Integer> even = new Stack<>();


        System.out.println("Enter 10 numbers to Stack");
        for (int i=0;i<10;i++){
            stack.push(in.nextInt());
        }

        while (!stack.isEmpty()){
            if(stack.peek()%2 == 0){
                even.push(stack.pop());
            }else {
                odd.push(stack.pop());
            }
        }

        System.out.println("Even numbers in Stack "+even);
        System.out.println("Odd numbers in Stack "+odd);


        while (!even.isEmpty()){
            stack.push(even.pop());
        }
    }
}
