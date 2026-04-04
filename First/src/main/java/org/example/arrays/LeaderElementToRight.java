package org.example.arrays;

public class LeaderElementToRight {
    //An element is a leader if it is greater than all elements to its right
    //i/p [16,17,4,3,5,2]
    //o/p [17,5,2]

    public static void findLeaderNumber(){
        int arr []= {16,17,4,3,5,2};

        int max=arr[arr.length-1];
        System.out.println("print last number as its always leader");


        for (int i =arr.length-2; i>= 0;i--){
           if (arr[i]>max){
               max=arr[i];
               System.out.println("Max"+ max + " ");
           }
        }
    }
}
