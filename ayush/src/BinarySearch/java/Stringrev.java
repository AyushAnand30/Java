package BinarySearch.java;

import java.util.Scanner;

public class Stringrev {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first input: ");
        int a = in.nextInt();
        System.out.print("Enter your Second input: ");
        int b = in.nextInt();
        System.out.print("Your desired result is: " + power(a,b));
    }
    public static int power(int a, int b){
        //base case
        if (b == 0){
            return 1;
        }
        if (b == 1){
            return  a;
        }
        return a*power(a,b-1);
    }
}