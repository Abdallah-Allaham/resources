package data_structure.stack_impl;

public class Main {

    public static void main(String[] args){
        StackImpl1 stackImpl1 = new StackImpl1(5);
        System.out.println(stackImpl1.isEmpty());

        stackImpl1.push(2);
        stackImpl1.push(5);
        stackImpl1.push(77);
        stackImpl1.push(100);
        stackImpl1.push(10);
        System.out.println(stackImpl1.isFull());

        System.out.println(stackImpl1.peek());
        System.out.println(stackImpl1.pop());
        System.out.println(stackImpl1.peek());

        /* --------------------------------------------------------------------- */

        StackImpl2 stackImpl2 = new StackImpl2(5);
        System.out.println(stackImpl2.isEmpty());

        stackImpl2.push(10);
        stackImpl2.push(20);
        stackImpl2.push(30);
        stackImpl2.push(40);
        stackImpl2.push(50);
        stackImpl2.push(60);
        System.out.println(stackImpl2.isFull());

        System.out.println(stackImpl2.peek());
        System.out.println(stackImpl2.pop());
        System.out.println(stackImpl2.peek());

        while (!stackImpl2.isEmpty()){
            System.out.print(stackImpl2.pop()+ " ");
        }

        System.out.println();
        System.out.println(stackImpl2.peek());
        System.out.println(stackImpl2.pop());

    }
}
