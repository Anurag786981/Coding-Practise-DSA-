package org.example.arrays;

public class DuplicateFromSortedArray {


    public static boolean CheckForSorted(int []arr){
        for (int i =0; i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;

    }
    public static void removeDuplicateFromSortedArray(int [] arr ){

        boolean isSorted= DuplicateFromSortedArray.CheckForSorted(arr);
        if (!isSorted){
            System.out.println("Array is not sorted");
        }else {
            System.out.println("Sorting started ");
            int j=0;
            for (int i =1;i<arr.length; i++){
                if (arr[i]!=arr[j]){
                    j++;
                    arr[j]=arr[i];

                }
            }
            //Printing Array
            for (int i =0;i<= j; i++){
                System.out.print(arr[i] + " ");
            }
        }



    }
}
