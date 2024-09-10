package Functions;

import java.util.Scanner;

public class Calculating_Power {
    public static void main(String[]args){
       // findAns(15,2);
        findAns();
        findAns();

    }
    static int findAns(){
       Scanner in = new Scanner(System.in);
        System.out.println("Enter first value: ");
         int a = in.nextInt();System.out.println("Enter the second value: ");
       int  b = in.nextInt();
        int ans = 1;
        for (int i = 1; i <= b ; i++) {
            ans = ans*a;



        }
        return ans;
    }

}
