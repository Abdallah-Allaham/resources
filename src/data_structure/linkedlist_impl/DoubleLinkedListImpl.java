package data_structure.linkedlist_impl;

public class DoubleLinkedListImpl {
    private DoubleNode first;

    public DoubleLinkedListImpl() {
        first = null;
    }

    public void insertFirst(int num){
        DoubleNode node = new DoubleNode(num);
        node.next = first;
        if (first != null){
            first.previous = node;
        }
        first = node;
    }

    public void insertLast(int num){
        DoubleNode node = new DoubleNode(num);

        if (first == null){
            first = node;
            return;
        }

        DoubleNode last = first;
        while (last.next != null){
            last = last.next;
        }
        last.next = node;
        node.previous = last;
    }

    public void printListFromFirst(){
        DoubleNode node = first;
        while (node != null){
            System.out.print(node.num+" ");
            node = node.next;
        }
        System.out.println();
    }

    public void printListFromLast(){
        if (first == null){
            return;
        }

        DoubleNode node = first;
        while (node.next != null){
            node=node.next;
        }

        do {
            System.out.print(node.num + " ");
            node = node.previous;
        }while (node != null);

        System.out.println();
    }

    public DoubleNode find(int key){
        DoubleNode current = first;
        while (current != null){
            if (current.num == key){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public DoubleNode deleteNode(int key){
        DoubleNode current = first;

        if(first == null ){
            return null;
        }

        while (current != null && current.num != key){
            current = current.next;
        }

        if(current == null){
            return null;
        }

        if(current == first){
            first = current.next;
            if (first != null){
                first.previous=null;
            }
        }else {
            current.previous.next=current.next;
            if (current.next != null){
                current.next.previous = current.previous;
            }
        }

        return current;
    }
}

class DoubleNode{
    public int num;
    public DoubleNode next;
    public DoubleNode previous;

    public DoubleNode(int num) {
        this.num = num;
    }
}
