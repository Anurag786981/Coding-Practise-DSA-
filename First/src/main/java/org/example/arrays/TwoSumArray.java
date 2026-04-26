package org.example.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumArray {
    public static boolean twoSumPointer(){
        int arr[]={2,6,5,8,11};
        int target= 14;
        int left=0;
        int right= arr.length-1;

        while(left<right){
            int sum = arr[left]+arr[right];
            if (sum==target){
                return true;
            }else if (sum<target){
                left++;
            }else{
                right --;
            }
        }
        return false;
    }

    public static void twoSumIndex(){
        int arr[]= {2,7,11,15};
        int target=9;

        HashMap<Integer,Integer> map =new HashMap<>();

        for (int i=0;i< arr.length;i++){
            int num=arr[i];
            int need= target-num;

            if (map.containsKey(need)){
                System.out.println("Index: " + map.get(need) + " "+ i);
                return;
            }
            map.put(num,i);
        }
        System.out.println("Not Found the TwoSum");
    }
}
