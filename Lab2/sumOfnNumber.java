package Lab2;

public class sumOfnNumber {
    static int sum(int n){
        if (n==0) {
            return 0;
        }
        return n+sum(--n);

    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
    }
}
