package data_structure.queue_impl;

public class QueueImpl {
    private int size;
    private int[] arr;
    private int front;
    private int rear;
    private int numOfItems;

    public QueueImpl(int size) {
        this.size = size;
        arr= new int[size];
        front=0;
        rear=-1;
        numOfItems=0;
    }

    public void insert(int num){
        if (isFull()){
            System.out.println("The Queue is Full");
            return;
        }
        if (rear == size-1){
            rear=-1;
        }
        arr[++rear]=num;
        numOfItems++;
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("The Queue is Empty");
            return -1;
        }
        int num=arr[front++];
        if (front == size){
            front=0;
        }
        numOfItems--;
        return num;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("The Queue is Empty");
            return -1;
        }else {
            return arr[front];
        }
    }

    public boolean isEmpty(){
        return numOfItems == 0;
    }

    public boolean isFull(){
        return numOfItems == size;
    }

    public int size(){
        return numOfItems;
    }
}

