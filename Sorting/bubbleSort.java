package Sorting;

import java.util.Arrays;

public class bubbleSort {
    static int[] bsort(int[] ar) {
        for (int i = 0; i < ar.length - 1; i++) { // outer loop
            for (int j = 0; j < ar.length - i - 1; j++) { // inner loop
                if (ar[j] > ar[j + 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
        return ar;
    }

    public static void main(String[] args) {
        int ar[] = {36, 19, 29, 12, 5};
        System.out.println(Arrays.toString(bsort(ar)));
    }
}

k