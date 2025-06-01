package data_structure.queue_impl;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskQueue {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the queue");
        int maxSize= in.nextInt();
        QueueImpl queue = new QueueImpl(maxSize);

        System.out.println("Enter the numbers in the queue");
        for (int i=0;i<maxSize;i++){
            queue.insert(in.nextInt());
        }

        int max=findMax(queue);
        System.out.println("Max Num is: "+ max);


        int min=findMin(queue);
        System.out.println("Min Num is: "+ min);

        queue = multiplyQueueBy2(queue);
        System.out.println("Print All Numbers in Queue After Multiply Queue By 2");
        printQueue(queue);

        QueueImpl merge1= new QueueImpl(3);
        QueueImpl merge2= new QueueImpl(3);

        merge1.insert(2);
        merge1.insert(1);
        merge1.insert(5);
        merge2.insert(10);
        merge2.insert(4);
        merge2.insert(3);


        System.out.println("merge and sort 2 queue ");
        QueueImpl mergedQueue=merge(merge1,merge2);
        printQueue(mergedQueue);


    }

    public static int findMax(QueueImpl queue){
        QueueImpl temp=new QueueImpl(queue.size());
        int max=queue.peek();
        temp.insert(queue.remove());

        while (!queue.isEmpty()){
            int num= queue.remove();
            temp.insert(num);

            if (num>max){
                max=num;
            }
        }

        while (!temp.isEmpty()){
            queue.insert(temp.remove());
        }

        return max;
    }

    public static int findMin(QueueImpl queue){
        QueueImpl temp=new QueueImpl(queue.size());
        int min=queue.peek();
        temp.insert(queue.remove());

        while (!queue.isEmpty()){
            int num= queue.remove();
            temp.insert(num);

            if (num<min){
                min=num;
            }
        }

        while (!temp.isEmpty()){
            queue.insert(temp.remove());
        }

        return min;
    }


    public static QueueImpl multiplyQueueBy2(QueueImpl queue){
        QueueImpl temp=new QueueImpl(queue.size());

        while (!queue.isEmpty()){
            int num= queue.remove();
            temp.insert(num*2);
        }
        return temp;
    }

    public static void printQueue(QueueImpl queue){
        QueueImpl temp=new QueueImpl(queue.size());

        while (!queue.isEmpty()){
            int num= queue.remove();
            temp.insert(num);
            System.out.print(num+" ");
        }

        System.out.println();
        while (!temp.isEmpty()){
            queue.insert(temp.remove());
        }

    }

    public static QueueImpl merge(QueueImpl q1, QueueImpl q2){
        ArrayList<Integer> integers = new ArrayList<>();
        QueueImpl mergedQueue= new QueueImpl(q1.size()+ q2.size());

        QueueImpl temp1= new QueueImpl(q1.size());
        while (!q1.isEmpty()){
            int num= q1.remove();
            temp1.insert(num);
            integers.add(num);
        }

        while (!temp1.isEmpty()){
            q1.insert(temp1.remove());
        }

        QueueImpl temp2= new QueueImpl(q2.size());
        while (!q2.isEmpty()){
            int num= q2.remove();
            temp2.insert(num);
            integers.add(num);
        }

        while (!temp2.isEmpty()){
            q2.insert(temp2.remove());
        }

        for (int i=0;i<integers.size()-1;i++){
            for (int j=0;j<integers.size()-i-1;j++){
                if(integers.get(j) > integers.get(j+1)){
                    int temp=integers.get(j);
                    integers.set(j,integers.get(j+1));
                    integers.set(j+1,temp);
                }
            }
        }

        for (int i=0;i<integers.size();i++){
            mergedQueue.insert(integers.get(i));
        }
        integers.clear();

        return mergedQueue;
    }

}
