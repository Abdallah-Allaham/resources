package data_structure.linkedlist_impl;

public class LinkedListImpl {
    private Node first;

    public LinkedListImpl() {
        this.first = null;
    }

    public void insertFirst(int num) {
        Node node = new Node(num);
        node.next = first;
        first = node;
    }

    public void insertLast(int num){
        Node node = new Node(num);

        if(first == null){
            first = node;
            return;
        }

        Node last = first;
        while (last.next != null){
            last = last.next;
        }
        last.next = node;
    }

    public void printList() {
        Node current = first;
        while (current != null) {
            System.out.print(current.num + " ");
            current = current.next;
        }
        System.out.println();
    }

    public Node find(int key) {
        Node current = first;
        while (current != null) {
            if (current.num == key) {
                return current;
            }
            current = current.next;
        }

        return null;
    }

    public Node delete(int key) {
        Node current = first;
        Node prev = null;

        if (current != null && current.num == key) {
            first = current.next;
            return current;
        }

        while (current != null && current.num != key) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            return null;
        }

        prev.next = current.next;
        return current;
    }

}

class Node {
    public int num;
    public Node next;

    public Node(int num) {
        this.num = num;
    }
}
