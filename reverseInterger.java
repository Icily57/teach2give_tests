// Question 5: Reverse Integer
// Write a program that takes an integer as input and returns an integer with reversed digit 
// ordering.

public class reverseInterger {
    public static int revInt(int input) {
        int revNumber = 0;
        while (input != 0) {
            int digit = input % 10;
            revNumber = revNumber * 10 + digit;
            input /= 10;
        }

        return revNumber;
    }

    public static void main(String[] args) {
        int number = 500;
        int reversedNumber = revInt(number);
        System.out.println("Original number:" + number);
        System.out.println("Reversed Number:" + reversedNumber);
    }
}
