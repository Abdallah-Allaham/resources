package data_structure.stack_impl;

public class StackImpl1 {
    private int[] arr;
    private int top;
    private int size;

    public StackImpl1(int size) {
        this.size = size;
        arr = new int[size];
        top=-1;
    }

    public void push(int number){
        arr[++top]=number;
    }

    public int peek(){
        return arr[top];
    }

    public int pop(){
        return arr[top--];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size-1;
    }

}
