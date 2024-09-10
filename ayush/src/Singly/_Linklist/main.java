package Singly._Linklist;



public class main {
    public static void main(String[]args){
        LL list = new LL();
        list.InsertFirst(2);
        list.InsertFirst(20);
        list.InsertFirst(200);
        list.InsertFirst(42);
        list.InsertFirst(72);
        list.InsertFirst(82);
        list.InsertLast(92);
        list.InsertAtIndex(25,2);
        list.deleteFirst();
        list.display();

    }
}

