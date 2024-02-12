// Question 2: Fibonacci Sequence
// Write a program to generate the Fibonacci sequence up to 100.

public class fibonacci_q2 {
    public static int fibonacci() {
        for (int i = 0; i <= 100; i++) {
            int prev = i;
            int current = prev + 1;
            int next = current + prev;
            System.out.println(prev);
            System.out.println(current);
            System.out.println(next);
        }
        return 0;
    }

    public static void main(String[] args) {
        int output = fibonacci();
        System.out.println(output);
    }
}
