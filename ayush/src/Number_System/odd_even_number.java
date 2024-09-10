package Number_System;

import java.util.Scanner;

public class odd_even_number {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the nummber: ");
       int  n = in.nextInt();
        isodd(n);


    }
    static void isodd(int n){

        if(((n & 1) ==1)) {
            System.out.println("no is odd ");
        }else {
            System.out.println("no is even:");
        }

        }
    }

