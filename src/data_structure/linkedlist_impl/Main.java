package data_structure.linkedlist_impl;

public class Main {
    public static void main(String[] args){
        LinkedListImpl linkedList=new LinkedListImpl();

        System.out.println("Test LinkedList");

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

        /////////////////////////////////////////////////////////////////////////

        System.out.println("Test DoubleLinkedList");

        DoubleLinkedListImpl doubleLinkedList = new DoubleLinkedListImpl();
        doubleLinkedList.insertFirst(10);
        doubleLinkedList.insertFirst(33);
        doubleLinkedList.insertLast(23);
        doubleLinkedList.insertLast(67);

        doubleLinkedList.printListFromFirst();
        doubleLinkedList.printListFromLast();

        doubleLinkedList.deleteNode(23);
        doubleLinkedList.printListFromFirst();
        DoubleNode find= doubleLinkedList.find(67);
        DoubleNode findNode2= doubleLinkedList.find(100);


        System.out.println(find != null ? find.num : "the node is null");
        System.out.println(findNode2 != null ? findNode2.num : "the node2 is null");

    }
}
