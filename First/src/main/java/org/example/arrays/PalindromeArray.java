package org.example.arrays;

public class PalindromeArray {
    // Input:  [1, 2, 3, 3, 1]
    //Output: true
    //
    //Input:  [1, 2, 3, 4]
    //Output: false

    public static boolean isPalindrome() {
        int arr []= {1, 2, 5, 2, 1} ;
         int first = 0;
         int last= arr.length-1;

         while (first<last)
         {
            if (arr[first]!= arr[last]){
                return false;
            }
            first++;
            last--;
         }

        return true;

    }
}
