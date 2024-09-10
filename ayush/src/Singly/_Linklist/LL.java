package Singly._Linklist;

public class LL{
    private Node head;
    private Node tail;
    private  int size;
    public LL(){

    }
    public void InsertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        //check for null pointer
        if (tail == null){
            tail = head;
        }
        size+=1;
    }
    public void InsertLast(int val){
        Node node = new Node(val);
        if (head == null){
            InsertFirst(val);
        }
        tail.next = node;
        tail = node;


    }
    public void InsertAtIndex(int value,int index){
        if (index == 0){
            InsertFirst(value);
            return;
        }
        if (index == size){
            InsertLast(value);
            return;

        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
            Node node = new Node(value,temp.next);
            temp.next = node;


        }
        size++;

    }
    public int  deleteFirst(){
        int  value = head.value;
        head = head.next;
        if (head == null){
            tail = null;

        }
        size--;
        return value;



    }
    public int deleteLast(){
        if (size<=1){
            deleteFirst();
        }
        Node secondLast = get(size-2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;


        size --;
        return value;
    }
    public Node  get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;

        }
        return node;
    }
    public int  delateParticular(int index){
        if (index == 0){
            deleteFirst();
        }
        if (index == size-1){
            deleteLast();
        }
        Node prev = get(index-1);
            int value = prev.next.value;
            prev.next = prev.next.next;
            size--;
            return value;



    }


    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " --> ");
            temp = temp.next;

        }
        System.out.println("End: ");
    }
    private class Node{
        private int value;
        private Node next;
        public Node(int value){

            this.value = value;


        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;

        }
    }

}