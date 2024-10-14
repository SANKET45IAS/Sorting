package Lab2;

public class MaxMinRecursion {

    public static int findMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.max(arr[n - 1], findMax(arr, n - 1));
    }

    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }

    public static void main(String[] args) {
        int[] arr = {12, 123, 5, 75, 1, 65};
        int n = arr.length;

        int max = findMax(arr, n);
        int min = findMin(arr, n);

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
