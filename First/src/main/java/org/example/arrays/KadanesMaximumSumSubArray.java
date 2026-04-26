package org.example.arrays;

public class KadanesMaximumSumSubArray {

    public static void kadanesMaximumSumSubArray() {

        int arr[] = {-2, 1, -3, 4, -1, 2};
        //i=0
        int bestEnding = arr[0];
        int ans = arr[0];

        for(int i=1; i<arr.length; i++){
            int v1= bestEnding+arr[i];
            int v2=arr[i];
            bestEnding=Math.max(v1,v2);

            ans= Math.max(ans,bestEnding);

        }
        System.out.println("Maximum SubArray Sum: "+ ans);
    }
    public static void kadanesProductmaxumumSubArray(){
        int arr[]={-2,3,-4};
        int minumumEnding=arr[0];
        int maximumEnding=arr[0];
        int ans=arr[0];
        for (int i=1;i< arr.length;i++){
            int v1=arr[i];
            int v2=minumumEnding*arr[i];
            int v3=maximumEnding*arr[i];

            maximumEnding= Math.max(v1,Math.max(v2,v3));
            minumumEnding=Math.min(v1,Math.min(v2,v3));
            ans=Math.max(ans,Math.max(minumumEnding,maximumEnding));

        }
        System.out.println("Maximum Product" + ans);
    }
}
