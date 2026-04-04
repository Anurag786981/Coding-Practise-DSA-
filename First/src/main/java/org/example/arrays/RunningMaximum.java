package org.example.arrays;

public class RunningMaximum {
    //Input:  [2, 1, 5, 3, 6]
    //Output: [2, 2, 5, 5, 6]

    public static void replaceNextElementWithSameIfGreater(){
        int arr []= {2, 1, 5, 3, 6};
        int first = arr[0];
        System.out.print(first + " ");

        for (int i =1; i< arr.length; i++){
            if (arr[i]>first){
                first=arr[i];
            }
            System.out.print(first+ " ");
        }


    }



}
