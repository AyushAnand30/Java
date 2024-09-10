package Number_System;

import java.util.Scanner;

public class ith_bit {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print(" Enter the number: ");
        int n = in.nextInt();
        System.out.println("Enter the ith bit of the number; ");
        int i = in.nextInt();



       find(n,i);


    }
    static void find(int n,int i){
        n = (i&(1<<(i-1)));
        System.out.println(n);



        }
    }
