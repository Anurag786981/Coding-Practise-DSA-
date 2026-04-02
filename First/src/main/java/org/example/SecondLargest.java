package org.example;

public class SecondLargest {

    static void findSecondLargestElementWithoutSorting(){
        int [] arr={2,4,6,1,3};

        // take two variable
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        // loop to iterate
        for (int num :arr){
            if (num>first){
                second = first;
                first=num;

            }else if(num>second && num !=first){
                second=num;
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println(second);
        }


    }

}
