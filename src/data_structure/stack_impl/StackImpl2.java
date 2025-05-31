package data_structure.stack_impl;

public class StackImpl2 {
    private int size;
    private int top;
    private int[] arr;

    public StackImpl2(int size) {
        this.size = size;
        top=-1;
        arr=new int[size];
    }

    public void push(int number){
        if(top >= (size - 1)){
            System.out.println("Stack is full");
        }else {
            arr[++top]=number;
        }
    }

    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }else {
            return arr[top];
        }
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }else {
            return arr[top--];
        }
    }

    public boolean isFull(){
        return top >= size-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
}
