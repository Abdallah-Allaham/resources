package data_structure.queue_impl;

public class Main {

    public static void main(String[] args){
        QueueImpl queue = new QueueImpl(5);
        queue.insert(7);
        queue.insert(3);
        queue.insert(0);

        while (!queue.isEmpty()){
            System.out.print(queue.remove()+"  ");
        }

        System.out.println();
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.peek());

    }
}
