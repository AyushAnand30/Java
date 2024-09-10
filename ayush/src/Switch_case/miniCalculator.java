package Switch_case;

import java.util.Scanner;

public class miniCalculator {
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);
        System.out.println("enter your value: ");
        int a= in.nextInt();
        int b = in.nextInt();
        System.out.print(" Enter which operation you want to perform: ");
         char op;
        op = in.next().charAt(0);
        switch (op){
            case '+' :
                int c =  a+b;
                System.out.print(" your result is: " + c);
                break;
            case '-':

                c = a-b;
                System.out.print(" your result is: " + c);
                break;
            case  '*':
                c = a*b;
                System.out.print(" your result is: " + c);
                break;
            case  '/':
                c = a/b;
                System.out.print(" Your result is: " +c);
                break;
            default:
                System.out.print(" Invalid click: ");

        }


    }
}
