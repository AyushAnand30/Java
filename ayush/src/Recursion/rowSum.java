package Recursion;

import java.util.Scanner;

public class rowSum {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of row:");
        int row = in.nextInt();
        System.out.println("Enter the number of col: ");
        int col = in.nextInt();
        int[][]arr = new int[row][col];



        System.out.println("Enter the input of the first element: ");
        for (int i = 0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = in.nextInt();
            }
        }
            for (int i = 0;i<row;i++) {
                int sum = 0;

                for (int j = 0; j < col; j++) {
                    sum+=arr[row][col];

                }
                System.out.print("your sum is " + (i+1) + sum);

            }
                }



            }















