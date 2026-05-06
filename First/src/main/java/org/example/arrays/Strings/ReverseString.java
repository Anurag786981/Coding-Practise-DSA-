package org.example.arrays.Strings;

public class ReverseString {
    //Brute force O(n2)

    public static void reverseThroughLoop(){

        String s = "hello";
        String result ="";
        for(int i = s.length()-1;i>=0;i--){
            result = result + s.charAt(i);
        }
        System.out.println("Reverse String " + result);
        // But it has O(n2) because everytime creating New Object.
    }
    public static void reverseUsingStringBuilder(){
        String s = "hello";

        StringBuilder sb = new StringBuilder();

        for (int i =s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));   // it will not create new object just append
        }
        System.out.println("Reverse String using Builder " + sb);
        //Time Complexity O(N).
    }
    public static void reverseUSingTwoPointer(){
        String s = "hello";

        char [] arr=s.toCharArray();
        int first=0;
        int last= arr.length-1;

        while(first<last){
            char temp = arr[first];
            arr[first] =arr[last];
            arr[last] = temp;

            first++;
            last--;

        }
        System.out.println("Reverse Array using Two Pointer "+ new String(arr));
    }

    public static void reverseHalfString(){
        String s = "hello";

        char [] arr=s.toCharArray();
        int first=0;
        int last= (arr.length/2)-1;

        while(first<last){
            char temp = arr[first];
            arr[first] =arr[last];
            arr[last] = temp;

            first++;
            last--;

        }
        System.out.println("Original String "+ s);
        System.out.println("Reverse Half Array using Two Pointer "+ new String(arr));

    }
    public static void pallindrome(){
        String s= "hello";
        char [] arr=s.toCharArray();
        int first =0;int last= arr.length-1;
        while(first<last){
            char temp = arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;

        }
        String pallindrome= new String(arr);
        if (s.equalsIgnoreCase(pallindrome)){
            System.out.println("given string is pallindrome " + pallindrome);
        }else{
            System.out.println("Not pallindrome ");
        }
    }
    public static  void optimisedPalindrome(){
        String s = "A man a plan a canal panama";
        // for above string first we have to remove space and then convert to lowercase.
       s= s.replace(" ","");
       //lower case
        s= s.toLowerCase();

        boolean ispalindrome=true;

        int first=0;
        int last=s.length()-1;
        while(first<last){
            if (s.charAt(first)!=s.charAt(last)){
                ispalindrome=false;
                break;
            }
            first++;
            last--;
        }
        if (ispalindrome){
            System.out.println("Given String is palindrome " + s);
        }else{
            System.out.println("Given String is NOT palindrome ");
        }

    }

}

