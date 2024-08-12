package com.searching;

import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array ");
        for (int i = 0 ; i<arr.length ; i++){
            arr[i]=input.nextInt();
        }

        System.out.println("Enter the element to search ");
        int target = input.nextInt();

        int ans = bsearch(arr,target);
        System.out.println(ans);

    }

    static int bsearch(int[] arr, int target){
        int start = 0 ;
        int end = arr.length-1;
        while(start <= end){
            //finding the middle element
            //int mid = (start + end )/2 but sometimes the size of end is so large due to start + end
            //so we use optimised
            int mid = start +(end - start)/2;

            //conditions for searching

            if (target > arr[mid]){
                start = start +1;
            }
            else if ( target < arr[mid]){
                end = end -1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
