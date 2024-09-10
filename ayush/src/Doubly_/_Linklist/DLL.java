package Doubly_._Linklist;

public class DLL {
    private Node head;
    public void InsertHead(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;


        if (head != null){
            head.prev = node;
        }
        head = node;
    }
    public void InsertAtEnd(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        node.prev = head;
        if (head == null){
            node.prev = null;
            head = null;
        }

    }
    public void Display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println(" End: ");
    }
    private class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val = val;

        }
        public Node (int val,Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;

        }
    }
}