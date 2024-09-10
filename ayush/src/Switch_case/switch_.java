package Switch_case;

import java.util.Scanner;

public class switch_ {
    public static void main(String[] args) {
        show();
        show();
        show();
        show();
        show();
        show();
        show();

    }

    static void show() {


        Scanner in = new Scanner(System.in);
        String fruits = in.next();
        switch (fruits) {
            case "Mango":
                System.out.println(" sweet ");
                break;
            case "sev":
                System.out.println(" good in test: ");
                break;
            case "papeeta":
                System.out.println(" grind: ");
                break;
            case " strobarry ":
                System.out.println("  strobarry wala : ");
                break;
            default:
                System.out.println("");

        }


    }
}

