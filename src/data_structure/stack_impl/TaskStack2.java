package data_structure.stack_impl;

import java.util.Scanner;
import java.util.Stack;

public class TaskStack2 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        System.out.println("Enter 7 numbers to Stack");
        for (int i=0;i<7;i++){
            stack.push(in.nextInt());
        }

        temp.push(stack.peek());
        int max=stack.pop();

        while (!stack.isEmpty()){
            int num=stack.pop();
            temp.push(num);

            if(num>max){
                max=num;
            }
        }
        System.out.println("The Maximum number in the Stack is: "+ max);

        stack.addAll(temp);
        temp.clear();

        temp.push(stack.peek());
        int min=stack.pop();

        while (!stack.isEmpty()){
            int num=stack.pop();
            temp.push(num);

            if(num<min){
                min=num;
            }
        }
        System.out.println("The Minimum number in the Stack is: "+ min);

        stack.addAll(temp);
        temp.clear();

        int sum=0;

        while (!stack.isEmpty()){
            int num=stack.pop();
            temp.push(num);
            sum += num;

        }
        System.out.println("Sum of numbers in the Stack is: "+ sum);
        System.out.println("The Average is: "+ sum/7);

        stack.addAll(temp);
        temp.clear();
    }
}
