package Number_System;

public class BitManipulationExample {
    public static void main(String[] args) {
        int number = 12; // Example number
        int i = 4; // The bit position (0-based index)

        // Get the value of the i-th bit
        int bitValue = (number & (1 << (number-1)));

        System.out.println("The " + i + "-th bit of " + number + " is: " + bitValue);
    }
}


