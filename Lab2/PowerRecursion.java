package Lab2;

public class PowerRecursion {
        public static int power(int base, int exp) {
            if (exp == 0) {
                return 1;
            }
            return base * power(base, exp - 1);
        }
    
        public static void main(String[] args) {
            int base = 3;  
            int exp=8;
            int result = power(base, exp);
            System.out.println(base + " raised to the power of " + exp + " is: " + result);
        }    
}
