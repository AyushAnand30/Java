import java.util.Scanner;

public class settingof_ith_bit {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your input: ");
        int num = in.nextInt();
        int sum = 0;
        while(num>0) {
            int rem = num % 10;
            sum = sum * 10 + rem;
            num /= 10;
        }
            System.out.println("Your ans is " + sum);

    }
}
