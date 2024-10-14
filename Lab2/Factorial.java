package Lab2;

public class Factorial {
        public static int factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * factorial(n - 1);
        }
    
        public static void main(String[] args) {
            int n = 20;
            int result = factorial(n);
            System.out.println("Factorial of " + n + " is: " + result);
        }
}
