// Question 4: Capitalize Words
// Write a program that accepts a string as input, capitalizes the first letter of each word in the 
// string, and then returns the result string.

import java.util.Scanner;

public class capitalizeString_Q4 {
    public static String capitalizedString(String inputString) {
        if (inputString.isEmpty()) {
            return "String is empty";
        }
        String[] words = inputString.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scan.nextLine();
        String output = capitalizedString(input);
        System.out.println(output);
    }
}