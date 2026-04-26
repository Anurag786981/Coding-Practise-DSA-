package org.example.Hashing;

import java.util.HashMap;

public class HashmapProblem {

    public static void firstNonRepeatingElement(){
        int arr[]={2,3,4,2,9,3,4,5,5};

        HashMap<Integer,Integer> map= new HashMap<>();
        for (int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int num:arr){
            if (map.get(num)==1){
                System.out.println("first Occurrence element"+ num);
                break;
            }
        }
    }

    public static void findMajorityElement(){
        int arr[]={2,2,1,1,2,2,3};
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int num: arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        boolean found = false;
        for (int num:arr){
            if (map.get(num) > arr.length / 2) {
                System.out.println(num);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("No Majority Element !!!");
        }
    }
    public static void mooreVotingAlgo(){
        int arr[]={2,2,1,1,2,2,3};
        int candidate =0;
        int count=0;
        for (int num:arr){
            if (count==0){
                candidate=num;
                count=1;
            }
            else if(num==candidate){
                count++;
            }else {
                count --;
            }
        }
        //Step 2 Verify
        count =0;
        for (int num:arr){
            if(num==candidate){
                count++;
            }
        }
        if (count>arr.length/2){
            System.out.println("Candidate Majority elemet : "+ candidate);
        }else {
            System.out.println("No Majority Element Moorey");
        }

    }
}
