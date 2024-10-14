package Lab2;

public class Fibonnaci {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;  // You can change this value to find the nth Fibonacci number
        int result = fibonacci(n);
        System.out.println(n + "th Fibonacci number is: " + result);
    }
}
