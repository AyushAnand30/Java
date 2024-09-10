package Number_System;

import java.util.Scanner;

public class setting_of_ith_bit {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter your number: ");
        int n = in.nextInt();
        System.out.println(setbits(n));

    }
    static int setbits(int n){
        int count = 0;
        while(n>0){
            count++;
            n = n&(n-1);

        }
        return count;


    }
}
