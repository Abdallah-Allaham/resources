package data_structure.linkedlist_impl;

public class Main {
    public static void main(String[] args){
        LinkedListImpl linkedList=new LinkedListImpl();

        linkedList.insertFirst(3);
        linkedList.insertFirst(7);
        linkedList.insertLast(1000);
        linkedList.insertFirst(10);
        linkedList.insertLast(55);

        linkedList.delete(1000);

        linkedList.printList();

        Node node = linkedList.delete(7);
        if(node == null){
            System.out.println("node is null");
        }else {
            System.out.println(node.num);
        }

        linkedList.printList();

        Node node1 = linkedList.find(9);
        if(node1 == null){
            System.out.println("node1 is null");
        }else {
            System.out.println(node1.num);
        }
    }
}
