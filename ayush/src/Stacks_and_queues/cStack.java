//package Stacks_and_queues;
//
//import java.util.EmptyStackException;
//
//public class cStack {
//    protected int[]data;
//    private static final int DEFAULT_Size = 10;
//    int ptr = -1;
//    //when nothing is passed
//    public cStack(){
//        this(DEFAULT_Size);
//    }
//
//    public cStack(int size) {
//        this.data = new int[size];
//    }
//    public boolean push(int item){
//
//        if (isFull){
//            System.out.println("Stack is full ");
//            return false;
//        }
//        ptr++;
//        data[ptr] = item;
//        return true;
//    }
//    public int pop() throws StackException{
//        if (isEmpty()){
//            throw new StackException;
//        }
//    }
//    public boolean isFull(){
//        return ptr == data.length-1;
//
//    }
//}
