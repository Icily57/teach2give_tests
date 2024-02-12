// Question 6: Count Vowels
// Write a program that counts the number of vowels in a sentence.

public class countVowels {
    public static int countVowelsQ6(String sentence) {
        int vowelCount = 0;
        sentence = sentence.toLowerCase();
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static void main(String[] args) {
        String sentence = "Hello world";
        int output = countVowelsQ6(sentence);
        System.out.println(output);
    }
}
