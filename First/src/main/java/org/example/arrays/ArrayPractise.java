package org.example.arrays;

public class ArrayPractise {

    public static void printArray(){
        int arr[]={2,4,5,6,4,};

        for (int i =1; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void findLargestElementinArray(){
        int arr[]={10,4,5,6,22,45};
        int min=arr[0];
        int max=arr[0];
        for (int i =1;i< arr.length;i++){
            if (arr[i]<min) {
                min=arr[i];
            }
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Minimum Element" +" "+ min);
        System.out.println("Maximum Element" + " "+max);
    }
    public static void moveZerosToEnd(){
        int arr[] ={0,1,0,3,12};
        int j=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]!=0){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
                j++;
            }
        }
        for (int num: arr){
            System.out.print(num + " ");
        }
    }
    public static boolean checkForSorted(int arr[]){
       // int arr []={1,1,2,2,3};
        boolean isSorted=true;

        for (int i=0;i< arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        return isSorted;
    }
    public static void removeDuplicateFromArray(){
        int arr[]= {1,1,2,2,3};
        checkForSorted(arr);
        if (checkForSorted(arr)){
            int j=0;
            for (int i=1;i< arr.length;i++){
                if (arr[i]!=arr[j]){
                    j++;
                    arr[j]=arr[i];
                }
            }
            for (int i=0;i<=j;i++){
                System.out.print( arr[i]);
            }
        } else {
            System.out.println("Array is not sorted");
        }

    }
    public static void findTheSecondSmallest(){
        int arr[]={10,4,5,6,22,45};
        int smallest =arr[0];
        int secondsmallest =Integer.MIN_VALUE;

        for (int i=0;i< arr.length;i++){
            if (arr[i]< smallest){
                secondsmallest = smallest;
                smallest =arr[i];
            }else if (arr[i]<secondsmallest && arr[i]!= smallest){
                secondsmallest =arr[i];
            }
        }
        System.out.println("Second minimum is " + secondsmallest);
    }
    public static void countZero(){
        int arr[]= {0,1,0,3,0};
        int count=0;
        for (int i =0; i< arr.length;i++){
            if (arr[i]==0){
                count++;
            }
        }
        System.out.println("Zero Count" + count);
    }
    public static void moveNegativeNumberToZero(){
        int arr[] = {1,-2,3,-4,5};

        int j=0;
        for (int i=0;i< arr.length;i++){
            if(arr[i]<0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for (int num : arr){
            System.out.print(num+ " ");
        }

    }
}
