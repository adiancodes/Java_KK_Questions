package com.searching;

public class linearsearch {
    //declaring an array
    public static void main(String[] args) {


        int[] arr = {1, 2, 34, 5, 76, 342, 875, -674, -98, 56, 0};

        //target = the element that we have to find

        int target = 65;

        int ans = lsearch(arr,target);
        System.out.println("Element found at " + ans + " index");
    }


    static int lsearch(int[] arr , int target){
        for ( int i = 0 ; i < arr.length ; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }


}
