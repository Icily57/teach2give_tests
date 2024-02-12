// Question 3: Power of Two
// Write a program that takes an integer as input and returns true if the input is a power of two.

import java.util.Scanner;

public class powerOfTwo {
    private static boolean two(int input) {
        if (input <= 0) {
            return false;
        }
        while (input > 1) {
            if (input % 2 != 0) {
                return false;
            }
            input = input / 2;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an interger: ");
        int input = scan.nextInt();
        boolean output = two(input);
        System.out.println(output);
        scan.close();
    }
}
