package org.example;

import org.example.arrays.FindUniqueXor;
import org.example.arrays.SecondLargest;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


// finding duplicate array
    static int findDuplicate(int[] arr) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        for (int i = 1; i <= arr.length - 1; i++) {
            xor = xor ^ i;
        }
        return xor;
    }

    // Min and Max element
    static  int findMinAndMax(int [] arr){
        int max = arr[0];
        for (int i =1; i< arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("Largerst "+ max);
        return max;

    }
    static void reverseArray(int [] arr){

        for (int i=0; i< arr.length;i++){
           // System.out.println("Array Before Reverse");
            System.out.print(arr[i]+" ");
        }
        System.out.println("Array After Reverse");
        int first =0;
        int last = arr.length-1;
        while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
        for (int i=0;i<= arr.length-1; i++){
           // System.out.println("Array After Reverse");
            System.out.print(arr[i] + " " );

        }
        System.out.println(" ");


    }

    static Boolean checkArraySortedOrNot(int [] arr){
        for (int i =0; i< arr.length-1;i++){
            if (arr[i]>arr[i+1])
                return  false;
        }
        return true;
    }

    static void findSecondlargestElement(int [] arr){
        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        int secondLargest= Integer.MIN_VALUE;

        for (int i =arr.length-2; i>=0;i--){
            if (arr[i] <largest){
                secondLargest= arr[i];
                break;
            }

        }
        System.out.println("Second largest element : " + secondLargest);
    }

    public static void main(String[] args) {
        int a[] = {2, 6, 4, 1, 3, 1, 4, 3, 6};

        int[] arr = {2, 6, 4, 1, 3, 1, 5};
        int [] checkSorted={1,2,10,4,5};

        int c=0;
       // Arrays.sort(arr);

        for (int i =0; i< arr.length-1;i++){
            if (arr[i]== arr[i+1]){
                System.out.println("Duplicate element "+ arr[i]);

            }
        }
        // Duplicate using two pointer
       /*int slow =0, fast =0;

       do{
           slow = a[slow];
           fast= a[a[fast]];
       }while(slow!=fast);

// As soon as they meet move both
       slow =0;   it is initial point where to start

       while(slow !=fast){
           slow = a[slow];
           fast= a[fast];

       }
        System.out.println("Duplicate is" + slow  );*/

        // Unique element using XOR

        Main obj = new Main();






        int d = Main.findDuplicate(arr);

        System.out.println("Duplicate number is " + d);

        findMinAndMax(a);

         reverseArray(a);
        boolean res= checkArraySortedOrNot(checkSorted);
        if (res==true){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }

        int secondlargerstArray []={150,30,200,170};

        findSecondlargestElement(secondlargerstArray);

        SecondLargest.findSecondLargestElementWithoutSorting();
        int findUnique = FindUniqueXor.findUnique(a);
        System.out.println(findUnique);


    }
}