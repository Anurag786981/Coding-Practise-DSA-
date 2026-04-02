package org.example.arrays;

public class FindUniqueXor {

   public static int findUnique(int[] arr) {
        int n = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            n = n ^ arr[i];
        }
        return n;
    }
}
