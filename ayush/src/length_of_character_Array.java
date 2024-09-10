import java.util.Scanner;

public class length_of_character_Array {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String name = in.next();
        //char[]arr = new char[];

       // System.out.println(getLength(arr));


    }
    static int getLength(char[]arr){
       int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;

        }
        return count;

    }
}
